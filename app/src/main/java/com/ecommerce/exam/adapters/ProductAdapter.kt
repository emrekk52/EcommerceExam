package com.ecommerce.exam.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.ecommerce.exam.R
import com.ecommerce.exam.constant.Constant.Companion.brandList
import com.ecommerce.exam.constant.Constant.Companion.isLogin
import com.ecommerce.exam.models.Product

class ProductAdapter(
    val context: Context,
    val list: List<Product>,
    val onClickItem: (position: Int) -> Unit,
    val addButtonClickItem: (price: Double) -> Unit,
) :
    RecyclerView.Adapter<ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(
            LayoutInflater.from(context).inflate(R.layout.product_design, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(list[position], onClickItem, addButtonClickItem)
    }

    override fun getItemCount() = list.size


}


class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val brandName = view.findViewById<TextView>(R.id.brandName)
    val productImage = view.findViewById<ImageView>(R.id.productImage)
    val price = view.findViewById<TextView>(R.id.price)
    val cardView = view.findViewById<CardView>(R.id.cardView)
    val addButton = view.findViewById<CardView>(R.id.addButton)

    fun bind(
        product: Product, onClick: (position: Int) -> Unit,
        addButtonClickItem: (price: Double) -> Unit
    ) {

        brandName.text = "${brandList[product.brandId].name}\n${product.name} ${product.liter}lt"
        productImage.setImageResource(product.image)
        price.text = "₺${product.price}"

        if (!isLogin) {
            addButton.visibility = View.GONE
        }else{
            addButton.setOnClickListener {
                addButtonClickItem(product.price)
            }
        }



        cardView.setOnClickListener {
            onClick(adapterPosition)
        }


    }

}