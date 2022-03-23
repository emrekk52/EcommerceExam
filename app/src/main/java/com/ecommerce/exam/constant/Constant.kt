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
                categoryId = 0,
                detail = "Buzdağı Su, tüketiciye ulaşan her pakette sağlık ve kalite standartlarına uygun üretimini sürdürür.\n" +
                        "Tüketicilerin sağlığını ve kaliteyi ön plana koyan Buzdağı Su, güvenle tüketilir."
            ),
            Product(
                name = "Cam Damacana",
                liter = 15.0,
                brandId = 0,
                image = R.drawable.buzdagicamdamacana,
                price = 240.0,
                categoryId = 0,
                detail = "Birbirinden farklı seçenekleriyle Buzdağı Su Ailesi her zaman sizinle beraber!\n" +
                        "İster evde, ister ofiste, ister dışarıda Buzdağı Su Ailesinin ihtiyacınıza uygun paketi, sağlığı yanınıza taşımak için hazır."
            ),
            Product(
                name = "Damacana",
                liter = 19.0,
                brandId = 0,
                image = R.drawable.buzdagi_damacana,
                price = 70.0,
                categoryId = 0,
                detail = "Bir yudum su bir ömür sağlık"
            ),
            Product(
                name = "Su",
                liter = 5.0,
                brandId = 1,
                image = R.drawable.fuska_su_5lt,
                price = 34.90,
                categoryId = 0,
                detail = "SU REZERVLERİ (Kaynaklar): FUSKA Doğal Kaynak Suyu yılın beş ayı karla kaplı olan Sapanca´nın yüksek dağlarından gelmektedir. İnsan faktöründen kirlenme rıskı olmayan FUSKA Doğal Kaynak Suyu canlı için yaşamsal önem arz eden zengin minareller içermektedir. FUSKA Doğal Kaynak Suyu fabrikası 35lt/saniye su rezervlerine sahiptir. Dünya standarlarında ve gıda yönetmeliğine uygun malzemeler kullanılarak 21 km´lik izale hattı ile kaynaklar fabrikaya indirilmiştir.\n" +
                        "\n" +
                        "Bu yüzden; FUSKA DOĞAL KAYNAK SUYU; Zengin mineraller içerdiğinden tercih edilme sebebidir.\n" +
                        "FUSKA DOĞAL KAYNAK SUYU değerleri; Sertlik; 2,78, Ph; 7,5 İletkenlik; 65´tir."
            ),
            Product(
                name = "Damacana",
                liter = 19.0,
                brandId = 2,
                image = R.drawable.abant_damacana,
                price = 105.40,
                categoryId = 0,
                detail = "Abant Su cam şişeleri dünyaca ünlü Brand Image tarafından tasarlanmıştır.\n"
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
                categoryId = 1,
                detail = "Coca-Cola, Amerika Birleşik Devletleri kökenli, karamelize şekerle tatlandırılmış, alkolsüz içecek markası. Dünyada en fazla tüketilen meşrubat olan Coca-Cola uluslararası araştırma ajansı Interbrandin sıralamasında 2005-2016 yılında dünyanın en pahalı markası olarak tanındı"
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
                categoryId = 1,
                detail = "Pepsi, 1893 yılında ABD'de yaratılmış, PepsiCo tarafından üretilen ve Dünya'da en popüler alkolsüz içecek markalarından biridir."
            ),
            Product(
                name = "Twist",
                liter = 0.330,
                brandId = 7,
                image = R.drawable.twist_pepsi,
                price = 6.75,
                categoryId = 1,
                detail = "Pepsi, 1893 yılında ABD'de yaratılmış, PepsiCo tarafından üretilen ve Dünya'da en popüler alkolsüz içecek markalarından biridir."
            ),
            Product(
                name = "Sade Gazoz",
                liter = 2.5,
                brandId = 6,
                image = R.drawable.uludag,
                price = 13.45,
                categoryId = 1,
                detail = "Uludağ Gazoz, Uludağ İçecek tarafından üretilen bir gazozdur. Marka adı, 1930 yılında klasik Uludağ Gazozu'nun gelişimine kadar uzanmaktadır. Limon aromasının yanı sıra portakal aromalı bir versiyonu da Uludağ Gazoz Portakal olarak pazarlanmaktadır."
            ),
            Product(
                name = "Gazoz",
                liter = 1.0,
                brandId = 5,
                image = R.drawable.sprite,
                price = 7.65,
                categoryId = 1,
                detail = "Sprite, limon ve misket limonu aromalı bir gazozdur. Kafein içermez. The Coca-Cola Company tarafından 1961'den beri üretilmektedir. Sprite Ice, Sprite Remix ve Sprite Zero Sugar türleri de vardır. Sprite'a Avustralya, İngiltere, Yeni Zelanda ve İsviçre'de limonata adı verilmektedir."
            ),

            Product(
                name = "Portakal Aromalı",
                liter = 2.5,
                brandId = 4,
                image = R.drawable.fanta,
                price = 13.75,
                categoryId = 1,
                detail = "Fanta, Alman iş adamı Max Keith'in önderliğinde Coca-Cola Deutschland tarafından yaratılan meyve aromalı gazlı meşrubat markasıdır. Dünya çapında 200'den fazla lezzet var."
            ),


            // carbonated waters
            Product(
                name = "Doğal Maden Suyu",
                liter = 0.2,
                brandId = 8,
                image = R.drawable.beypazari,
                price = 6.35,
                categoryId = 2,
                detail = "Doğanın adeta insanoğluna sakladığı mucizeyi,1957′ den beri tüketicilerinin beğenisine sunan markamızın hikayesi; ilk adımını attığı, Ankara’nın Beypazarı ilçesinde başlar.Dönemin şartlarını zorlayarak kurulan fabrikamız, bugün 70 bin metrekarelik kapalı alanıyla Türkiye nin sektöründe en büyük maden suyu fabrikası olmuştur."
            ),

            Product(
                name = "Maden Suyu",
                liter = 0.2,
                brandId = 9,
                image = R.drawable.kizilay,
                price = 4.75,
                categoryId = 2, detail = "Kızılay Maden Suyu, kaynağı Gazlıgöl'de olan maden suyu."
            ),


            // juices
            Product(
                name = "7/24 Tahıllı Karışık",
                liter = 0.2,
                brandId = 10,
                image = R.drawable.dimes_s,
                price = 4.50,
                categoryId = 3,
                detail = "DİMES, 1958 yılında Tokat'ta kurulan Türkiye'nin ilk meyve suyu üreticisi şirket. Günümüzde süt ürünleri, limonata ve kahveli içecekler de üretmektedir."
            ),

            Product(
                name = "Smoothie",
                liter = 0.310,
                brandId = 10,
                image = R.drawable.dimes_smoothie,
                price = 4.75,
                categoryId = 3,
                detail = "DİMES, 1958 yılında Tokat'ta kurulan Türkiye'nin ilk meyve suyu üreticisi şirket. Günümüzde süt ürünleri, limonata ve kahveli içecekler de üretmektedir."
            ),
            Product(
                name = "Pulpy Şeftali",
                liter = 1.5,
                brandId = 12,
                image = R.drawable.cappy,
                price = 10.35,
                categoryId = 3,
                detail = "Cappy, Avrupa'da The Coca-Cola Company tarafından üretilen bir meyve suyu markasıdır. Birçok ülkede Minute Maid ismi ile satılır."
            ),

            Product(
                name = "Günaydın",
                liter = 1.0,
                brandId = 11,
                image = R.drawable.tropicana,
                price = 8.75,
                categoryId = 3,
                detail = "Tropicana, dünyadaki en büyük meyve suyu üreten şirkettir."
            ),


            // ayrans
            Product(
                name = "Ayran",
                liter = 0.2,
                brandId = 13,
                image = R.drawable.icim,
                price = 3.50,
                categoryId = 4,
                detail = "Süt ve süt ürünleri pazarına 1998 yılında giren İçim markası olarak, kurulduğumuz günden bu yana sütten yoğurda, ayrandan kefire, taze peynirden hazır pudinge kadar doğal, lezzetli, kaliteli ve besleyici pek çok ürünümüzü tüketiciyle buluşturuyoruz."
            ),

            Product(
                name = "Ayran %100 Doğal",
                liter = 0.200,
                brandId = 14,
                image = R.drawable.sutas,
                price = 4.75,
                categoryId = 4,
                detail = "Doğal ve sağlıklı Sütaş Ayran benzersiz kıvamı ve lezzeti ile 7’den 70’e herkesin tercihi!\n" +
                        "Sütaş Ayran içtikçe ferahlayacak ve kendinizi yenilenmiş hissedeceksiniz.\n" +
                        "İster evde, ister dışarıda; yemeklerin yanında veya atıştırmalıklarla beraber günün herhangi bir saatinde keyifle tüketeceğiniz Sütaş Ayran hem sağlıklı hem de çok lezzetli!"
            ),
            Product(
                name = "Ayran Doğal",
                liter = 2.0,
                brandId = 14,
                image = R.drawable.sutas_2lt,
                price = 12.79,
                categoryId = 4,
                detail = "Doğal ve sağlıklı Sütaş Ayran benzersiz kıvamı ve lezzeti ile 7’den 70’e herkesin tercihi!\n" +
                        "Sütaş Ayran içtikçe ferahlayacak ve kendinizi yenilenmiş hissedeceksiniz.\n" +
                        "İster evde, ister dışarıda; yemeklerin yanında veya atıştırmalıklarla beraber günün herhangi bir saatinde keyifle tüketeceğiniz Sütaş Ayran hem sağlıklı hem de çok lezzetli!"
            ),

            Product(
                name = "Nefis Ayran",
                liter = 1.0,
                brandId = 15,
                image = R.drawable.torku_1lt,
                price = 6.75,
                categoryId = 4,
                detail = "Torku, Konya Şeker tarafından üretimi yapılan ürünlerin tek çatı altında toplandığı marka. Ürün portföyü şeker, şekerleme, çikolata, unlu mamüller, dondurulmuş ürünler, modern seracılık ürünleri, süt ve süt ürünleri, et ve et ürünleri ile bitkisel yağlardan oluşmaktadır."
            ),

            Product(
                name = "Nefis Ayran",
                liter = 0.300,
                brandId = 15,
                image = R.drawable.torku,
                price = 2.50,
                categoryId = 4,
                detail = "Torku, Konya Şeker tarafından üretimi yapılan ürünlerin tek çatı altında toplandığı marka. Ürün portföyü şeker, şekerleme, çikolata, unlu mamüller, dondurulmuş ürünler, modern seracılık ürünleri, süt ve süt ürünleri, et ve et ürünleri ile bitkisel yağlardan oluşmaktadır."
            )


        )


    }


}