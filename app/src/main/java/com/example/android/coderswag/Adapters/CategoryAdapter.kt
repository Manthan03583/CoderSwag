package com.example.android.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.android.coderswag.Models.Category
import com.example.android.coderswag.R
import com.example.android.coderswag.Services.DataService.catagories
import kotlinx.android.synthetic.main.custom_list_item.view.*

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val categories = categories
    val context = context

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        categoryView = LayoutInflater.from(context).inflate(R.layout.custom_list_item, null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.CatagoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.CatagoryName)

        val category = categories[position]
        categoryName.text = category.tittle

        val resourceId = context.resources.getIdentifier(category.image, "drawable",context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        return categoryView
    }
}