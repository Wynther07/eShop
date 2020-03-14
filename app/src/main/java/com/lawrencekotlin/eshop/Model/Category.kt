package com.lawrencekotlin.eshop.Model

class Category (val catTitle:String, val catImage: String) {
    //Return title instead of address
    override fun toString(): String {
        return catTitle
    }
}