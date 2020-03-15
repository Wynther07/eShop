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
    //passed in parameters to local variables
    val wContext = pContext
    val wCategories = pCategories

    override fun getView(pPosition: Int, pConvertView: View?, pParent: ViewGroup?): View {
        val categoryView: View
        val holder : ViewHolder
        println("pPosition:$pPosition pConvertView:$pConvertView, pParent:$pParent")
        // Initializes/Reuse instances loaded into the view/grid holder
        if (pConvertView == null) {
            //load data to view
            categoryView = LayoutInflater.from(wContext)
                .inflate(R.layout.category_list_item, null)
            //load data to view golder
            holder = ViewHolder() //view instance holder
            holder.catImage = categoryView.findViewById(R.id.catImage)
            holder.catName = categoryView.findViewById(R.id.catName)
            categoryView.tag = holder //sets the tag to view entry
            println("initialize view, $pConvertView")
        } else {
            holder = pConvertView.tag as ViewHolder //getTag and set as ViewHolder
            categoryView = pConvertView //assign to catView
            println("instance in holder, $pConvertView")
        }

        println("wContext:$wContext, wCategories:$wCategories")
        val category = wCategories[pPosition]
        println("wCat[Pos]:$category")
        val resourceId = wContext.resources.getIdentifier(category.catImage,
            "drawable", wContext.packageName)
        holder.catImage?.setImageResource(resourceId)
        holder.catName?.text = category.catTitle
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

    private class ViewHolder {
        var catImage: ImageView? = null
        var catName: TextView? = null
    }
}