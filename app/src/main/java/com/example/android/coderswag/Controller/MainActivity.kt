package com.example.android.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.coderswag.Adapters.CategoryRecycleAdapter
import com.example.android.coderswag.Models.Category
import com.example.android.coderswag.R
import com.example.android.coderswag.Services.DataService
import com.example.android.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
          //Toast.makeText(this,category.tittle,Toast.LENGTH_SHORT).show()

        adapter = CategoryRecycleAdapter(this,DataService.catagories){ category ->
            val productIntent = Intent(this,ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.tittle)
            startActivity(productIntent)
        }
        CategoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        CategoryListView.layoutManager = layoutManager
        CategoryListView.setHasFixedSize(true)
    }
}