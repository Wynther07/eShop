package com.lawrencekotlin.eshop.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.lawrencekotlin.eshop.Model.Category
import com.lawrencekotlin.eshop.R


class CategoryAdapter(pContext: Context, pCategories: List<Category>) : BaseAdapter() {

    val wContext = pContext
    val wCategories = pCategories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(wContext).inflate(R.layout.category_list_item, null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.catImage)
        val categoryName: TextView = categoryView.findViewById(R.id.catName)
        println("Heavy Computing")

        val category = wCategories[position]

        val resourceId =
            wContext.resources.getIdentifier(category.catImage, "drawable", wContext.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)
        categoryName.text = category.catTitle
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return wCategories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return wCategories.count()
    }
}