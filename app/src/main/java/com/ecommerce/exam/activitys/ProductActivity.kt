package com.ecommerce.exam.activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.ecommerce.exam.R
import com.ecommerce.exam.adapters.TabPagerAdapter
import com.ecommerce.exam.constant.Constant.Companion.categoryList
import com.ecommerce.exam.constant.Constant.Companion.isLogin
import com.ecommerce.exam.constant.Constant.Companion.subTotal
import com.ecommerce.exam.databinding.ActivityProductBinding
import com.ecommerce.exam.utils.fullScreen
import com.google.android.material.tabs.TabLayoutMediator

class ProductActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.fullScreen(true)

        checkIsLogin()

        setUpTabLayoutWithViewPager()

        onClicks()


        subTotal.observe(this) {
            binding.topBarInclude.subTotalText.text =
                "₺${String.format("%.1f", it).replace(".", ",")}"
        }
    }

    private fun setUpTabLayoutWithViewPager() {
        binding.viewPager.adapter = TabPagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = categoryList[position].name
        }.attach()

        categoryList.forEachIndexed { index, _ ->

            val textView =
                LayoutInflater.from(this).inflate(R.layout.category_design, null) as TextView

            binding.tabLayout.getTabAt(index)?.text = categoryList[index].name
            binding.tabLayout.getTabAt(index)?.customView = textView


        }

    }


    private fun onClicks() {

        binding.apply {


            topBarInclude.backButton.setOnClickListener {
                finish()
            }


        }
    }


    private fun checkIsLogin() {
        binding.apply {

            if (!isLogin) {
                topBarInclude.shopLayout.visibility = View.INVISIBLE
            }


        }

    }


}