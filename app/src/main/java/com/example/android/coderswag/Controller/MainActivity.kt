package com.example.android.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.coderswag.Adapters.CategoryRecycleAdapter
import com.example.android.coderswag.R
import com.example.android.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this,DataService.catagories)
        CategoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        CategoryListView.layoutManager = layoutManager
        CategoryListView.setHasFixedSize(true)
    }
}