package com.lawrencekotlin.eshop.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lawrencekotlin.eshop.Model.Category

//Steps
//Extend to Recycler Adapter
//Recycler have a built iun view holder so just use that
//RClick RecyclerView in holder
//add type to CatRecAdapter .adapter holder
//ae on class then implement members


class CatRecAdapter(val pContext: Context, val pCategories:List<Category>) : RecyclerView.Adapter<CatRecAdapter.holder> {
    inner class holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: holder, position: Int) {
        TODO("Not yet implemented")
    }

}