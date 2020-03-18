package com.lawrencekotlin.eshop.Controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.lawrencekotlin.eshop.Adapter.CategoryRecycleAdapter
//import com.lawrencekotlin.eshop.Utilities.EXTRA_CATEGORY
import com.lawrencekotlin.eshop.R
import com.lawrencekotlin.eshop.Services.DataService
import com.lawrencekotlin.eshop.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

//ListViews are legacy features
//Data is normally from API or Internet

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}

