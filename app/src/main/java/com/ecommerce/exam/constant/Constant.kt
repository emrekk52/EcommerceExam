package com.ecommerce.exam.constant

import androidx.lifecycle.MutableLiveData
import com.ecommerce.exam.R
import com.ecommerce.exam.models.Brand
import com.ecommerce.exam.models.Category
import com.ecommerce.exam.models.Product

class Constant {


    companion object {


        const val LOGIN_PHONE = "01111111111"
        const val LOGIN_PASSWORD = "#e&it1m"


        // observable value
        var subTotal = MutableLiveData(0.0)
        var isLogin = false


        val categoryList: List<Category> = listOf(

            Category(id = 0, name = "Su"),
            Category(id = 1, name = "Gazlı İçecek"),
            Category(id = 2, name = "Maden Suyu"),
            Category(id = 3, name = "Meyve Suyu"),
            Category(id = 4, name = "Ayran & Kefir"),

            )

        val brandList: List<Brand> = listOf(

            // water brands
            Brand(id = 0, name = "Buzdağı"),
            Brand(id = 1, name = "Fuska"),
            Brand(id = 2, name = "Abant"),

            // carbonated beverage brands
            Brand(id = 3, name = "Coca Cola"),
            Brand(id = 4, name = "Fanta"),
            Brand(id = 5, name = "Sprite"),
            Brand(id = 6, name = "Uludağ"),
            Brand(id = 7, name = "Pepsi"),

            // carbonated water brands
            Brand(id = 8, name = "Beypazarı"),
            Brand(id = 9, name = "Kızılay"),

            // juice brands
            Brand(id = 10, name = "Dimes"),
            Brand(id = 11, name = "Tropicana"),
            Brand(id = 12, name = "Cappy"),

            // ayran brands
            Brand(id = 13, name = "İçim"),
            Brand(id = 14, name = "Sütaş"),
            Brand(id = 15, name = "Torku")

        )


        val productList: List<Product> = listOf(

            // waters
            Product(
                name = "Su",
                liter = 0.5,
                brandId = 0,
                image = R.drawable.buzdagi1,
                price = 6.40,
                categoryId = 0
            ),
            Product(
                name = "Cam Damacana",
                liter = 15.0,
                brandId = 0,
                image = R.drawable.buzdagicamdamacana,
                price = 240.0,
                categoryId = 0
            ),
            Product(
                name = "Damacana",
                liter = 19.0,
                brandId = 0,
                image = R.drawable.buzdagi_damacana,
                price = 70.0,
                categoryId = 0
            ),
            Product(
                name = "Su",
                liter = 5.0,
                brandId = 1,
                image = R.drawable.fuska_su_5lt,
                price = 34.90,
                categoryId = 0
            ),
            Product(
                name = "Damacana",
                liter = 19.0,
                brandId = 2,
                image = R.drawable.abant_damacana,
                price = 105.40,
                categoryId = 0
            ),
            Product(
                name = "Doğal Kaynak Suyu",
                liter = 0.5,
                brandId = 2,
                image = R.drawable.abant_05,
                price = 9.75,
                categoryId = 0
            ),


            // carbonated beverage
            Product(
                name = "Zero Sugar",
                liter = 1.0,
                brandId = 3,
                image = R.drawable.zero,
                price = 7.50,
                categoryId = 1
            ),
            Product(
                name = "Kutu",
                liter = 0.330,
                brandId = 3,
                image = R.drawable.kutu_cola,
                price = 4.75,
                categoryId = 1,
                detail = "Soğuk içiniz"
            ),
            Product(
                name = "Kutu",
                liter = 0.330,
                brandId = 7,
                image = R.drawable.kutu_pepsi,
                price = 5.25,
                categoryId = 1
            ),
            Product(
                name = "Twist",
                liter = 0.330,
                brandId = 7,
                image = R.drawable.twist_pepsi,
                price = 6.75,
                categoryId = 1
            ),
            Product(
                name = "Sade Gazoz",
                liter = 2.5,
                brandId = 6,
                image = R.drawable.uludag,
                price = 13.45,
                categoryId = 1
            ),
            Product(
                name = "Gazoz",
                liter = 1.0,
                brandId = 5,
                image = R.drawable.sprite,
                price = 7.65,
                categoryId = 1
            ),

            Product(
                name = "Portakal Aromalı",
                liter = 2.5,
                brandId = 4,
                image = R.drawable.fanta,
                price = 13.75,
                categoryId = 1
            ),


            // carbonated waters
            Product(
                name = "Doğal Maden Suyu",
                liter = 0.2,
                brandId = 8,
                image = R.drawable.beypazari,
                price = 6.35,
                categoryId = 2
            ),

            Product(
                name = "Maden Suyu",
                liter = 0.2,
                brandId = 9,
                image = R.drawable.kizilay,
                price = 4.75,
                categoryId = 2
            ),


            // juices
            Product(
                name = "7/24 Tahıllı Karışık",
                liter = 0.2,
                brandId = 10,
                image = R.drawable.dimes_s,
                price = 4.50,
                categoryId = 3
            ),

            Product(
                name = "Smoothie",
                liter = 0.310,
                brandId = 10,
                image = R.drawable.dimes_smoothie,
                price = 4.75,
                categoryId = 3
            ),
            Product(
                name = "Pulpy Şeftali",
                liter = 1.5,
                brandId = 12,
                image = R.drawable.cappy,
                price = 10.35,
                categoryId = 3
            ),

            Product(
                name = "Günaydın",
                liter = 1.0,
                brandId = 11,
                image = R.drawable.tropicana,
                price = 8.75,
                categoryId = 3
            ),


            // ayrans
            Product(
                name = "Ayran",
                liter = 0.2,
                brandId = 13,
                image = R.drawable.icim,
                price = 3.50,
                categoryId = 4
            ),

            Product(
                name = "Ayran %100 Doğal",
                liter = 0.200,
                brandId = 14,
                image = R.drawable.sutas,
                price = 4.75,
                categoryId = 4
            ),
            Product(
                name = "Ayran Doğal",
                liter = 2.0,
                brandId = 14,
                image = R.drawable.sutas_2lt,
                price = 12.79,
                categoryId = 4
            ),

            Product(
                name = "Nefis Ayran",
                liter = 1.0,
                brandId = 15,
                image = R.drawable.torku_1lt,
                price = 6.75,
                categoryId = 4
            ),

            Product(
                name = "Nefis Ayran",
                liter = 0.300,
                brandId = 15,
                image = R.drawable.torku,
                price = 2.50,
                categoryId = 4
            )


        )


    }


}