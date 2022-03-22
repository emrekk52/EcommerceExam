package com.ecommerce.exam.activitys


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.method.PasswordTransformationMethod
import android.text.method.SingleLineTransformationMethod
import android.view.MotionEvent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ecommerce.exam.R
import com.ecommerce.exam.constant.Constant.Companion.LOGIN_PASSWORD
import com.ecommerce.exam.constant.Constant.Companion.LOGIN_PHONE
import com.ecommerce.exam.constant.Constant.Companion.isLogin
import com.ecommerce.exam.databinding.ActivityLoginBinding
import com.ecommerce.exam.utils.fullScreen
import com.ecommerce.exam.utils.showLoadingDialog
import com.ecommerce.exam.utils.showLoginInfoDialog
import kotlinx.coroutines.*


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private var visibleOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.fullScreen()
        onClicks()


    }

    @SuppressLint("ClickableViewAccessibility")
    private fun onClicks() {

        binding.apply {

            editTextPassword.setOnTouchListener { view, motionEvent ->

                val DRAWABLE_RIGHT = 2

                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    println("rawX " + motionEvent.getRawX())
                    println("get right  " + editTextPassword.getRight())
                    println(
                        "get bounds " + editTextPassword.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds()
                            .width()
                    )

                    if (motionEvent.getRawX() >= (editTextPassword.getRight() - editTextPassword.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds()
                            .width() - 40f)
                    ) {

                        editTextPassword.setCompoundDrawablesWithIntrinsicBounds(
                            0,
                            0,
                            if (visibleOn) R.drawable.visible_on else R.drawable.visible_off,
                            0
                        )

                        editTextPassword.transformationMethod =
                            if (visibleOn) PasswordTransformationMethod.getInstance()
                            else SingleLineTransformationMethod.getInstance()


                        visibleOn = !visibleOn

                        true
                    }
                }
                false


            }


            loginButton.setOnClickListener {


                CoroutineScope(Dispatchers.Unconfined).launch {

                    if (editTextPassword.text.toString()
                            .isNotEmpty() && editTextPhone.text.toString().isNotEmpty()
                    ) {

                        errorPasswordText.visibility = View.GONE
                        errorPhoneText.visibility = View.GONE


                        if (checkPhoneAndPassword(
                                editTextPhone.text.toString(),
                                editTextPassword.text.toString()
                            ).await()
                        ) {
                            isLogin = true
                            val intent = Intent(this@LoginActivity, ProductActivity::class.java)
                            intent.putExtra("isLogin", true)
                            startActivity(intent)
                            finish()
                        } else {
                            this@LoginActivity.showLoginInfoDialog(
                                title = getString(R.string.loginErrorTitle),
                                message = getString(R.string.loginErrorMessage)
                            )
                        }
                    } else {
                        errorPasswordText.visibility = if (editTextPassword.text.toString()
                                .isNotEmpty()
                        ) View.GONE else View.VISIBLE

                        errorPhoneText.visibility = if (editTextPhone.text.toString()
                                .isNotEmpty()
                        ) View.GONE else View.VISIBLE
                    }


                }


            }


            continueButton.setOnClickListener {
                val intent = Intent(this@LoginActivity, ProductActivity::class.java)
                intent.putExtra("isLogin", false)
                startActivity(intent)

            }


        }

    }

    private fun checkPhoneAndPassword(phone: String, password: String) =
        CoroutineScope(Dispatchers.Unconfined).async {


            val dialog = this@LoginActivity.showLoadingDialog(
                title = getString(R.string.loadingLoginTitle),
                message = getString(R.string.loadingLoginMessage)
            )
            delay(2000)

            dialog.dismiss()

            if (phone.trim().lowercase().equals(LOGIN_PHONE) && password
                    .equals(LOGIN_PASSWORD)
            )
                true
            else
                false


        }


}