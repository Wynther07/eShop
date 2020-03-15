package com.lawrencekotlin.eshop.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.lawrencekotlin.eshop.Adapter.CategoryAdapter
import com.lawrencekotlin.eshop.Model.Category
import com.lawrencekotlin.eshop.R
import com.lawrencekotlin.eshop.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

//ListViews are legacy features
//Data is normally from API or Internet

class MainActivity : AppCompatActivity() {

//    lateinit var catAdapter : ArrayAdapter<Category>
    lateinit var catAdapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //context, adapter type, data source
//        catAdapter = ArrayAdapter(this,
//            android.R.layout.simple_list_item_1, DataService.categories)
//        //initialize array adapter
//        catListView.adapter = catAdapter
        catAdapter = CategoryAdapter(this, DataService.categories)
        catListView.adapter = catAdapter

    }
}
