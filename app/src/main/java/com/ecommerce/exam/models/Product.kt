package com.ecommerce.exam.models

import android.os.Parcelable
import androidx.annotation.DrawableRes
import java.io.Serializable


/* marka ve kategori sınıflarını doğrudan model içerisinde vermek yerine id numarası ile eşleştirerek almanın diğer sınıflara bağımlılığını azaltacağını düşündüğüm için bu şekilde kullandım.

 */

/* I used it this way because I thought that matching the brand and category classes with the id number instead of giving them directly in the model would reduce the dependency on other classes.
 */


data class Product(
    val name: String,
    val brandId: Int,
    @DrawableRes val image: Int,
    val price: Double,
    var liter: Double,
    var categoryId: Int,
    var detail: String? = null
) : Serializable