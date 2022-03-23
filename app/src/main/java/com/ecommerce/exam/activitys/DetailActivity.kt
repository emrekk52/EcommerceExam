package com.ecommerce.exam.activitys

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ecommerce.exam.constant.Constant.Companion.brandList
import com.ecommerce.exam.constant.Constant.Companion.isLogin
import com.ecommerce.exam.constant.Constant.Companion.subTotal
import com.ecommerce.exam.databinding.ActivityDetailBinding
import com.ecommerce.exam.models.Product
import com.ecommerce.exam.utils.fullScreen

class DetailActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailBinding
    lateinit var product: Product

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        this.fullScreen(true)

        product = intent?.getSerializableExtra("product") as Product

        checkIsLogin()
        binding.apply {


            subTotal.observe(this@DetailActivity) {

                topBarInclude.subTotalText.text = "₺${String.format("%.1f", it).replace(".", ",")}"

            }


            topBarInclude.productText.text = "Ürün Detayları"


            productImage.setImageResource(product.image)

            brandName.text = "${brandList[product.brandId].name}\n ${product.name} ${product.liter}lt"
            price.text = "₺${String.format("%.2f", product.price)}"
            product.detail?.let {
                detail.text = it
                detail.visibility = View.VISIBLE
            }


            addButton.setOnClickListener {
                subTotal.value = subTotal.value?.plus(product.price)
            }

            topBarInclude.backButton.setOnClickListener {
                finish()
            }

        }


    }

    private fun checkIsLogin() {

        if (!isLogin) {
            binding.topBarInclude.shopLayout.visibility = View.INVISIBLE
            binding.addButton.visibility = View.INVISIBLE
        }

    }
}