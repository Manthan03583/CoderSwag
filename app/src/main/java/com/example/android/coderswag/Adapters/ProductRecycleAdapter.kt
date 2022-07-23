package com.example.android.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.coderswag.Models.Product
import com.example.android.coderswag.R

class ProductRecycleAdapter(val context: Context, val products: List<Product>) :RecyclerView.Adapter<ProductRecycleAdapter.ProductHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(context, products[position])
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productImage = itemView.findViewById<ImageView>(R.id.ProductImage)
        val productName = itemView.findViewById<TextView>(R.id.ProductName)
        val productPrice = itemView.findViewById<TextView>(R.id.ProductPrice)

        fun bindProduct(context: Context, products: Product){
            val resourceId = context.resources.getIdentifier(products.image,"drawable",context.packageName)
            productImage.setImageResource(resourceId)
            productName.text = products.tittle
            productPrice.text = products.price
        }
    }
}
