package com.example.android.coderswag.Services

import com.example.android.coderswag.Models.Category
import com.example.android.coderswag.Models.Product

object DataService {
    val catagories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("Digital","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$20","hat2"),
        Product("Hat White","$18","hat3"),
        Product("Hat Snapback","$22","hat4"),
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$20","hat2"),
        Product("Hat White","$18","hat3"),
        Product("Hat Snapback","$22","hat4"),
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$20","hat2"),
        Product("Hat White","$18","hat3"),
        Product("Hat Snapback","$22","hat4"),
        Product("Graphic Beanie","$18","hat1"),
        Product("Hat Black","$20","hat2"),
        Product("Hat White","$18","hat3"),
        Product("Hat Snapback","$22","hat4"),
    )

    val hoodies = listOf(
        Product("Hoodies Gray","$28","hoodie1"),
        Product("Hoodies Red","$32","hoodie2"),
        Product("Blue Hoodie","$29","hoodie3"),
        Product("Black Hoodie","$29","hoodie4"),
        Product("Hoodies Gray","$28","hoodie1"),
        Product("Hoodies Red","$32","hoodie2"),
        Product("Blue Hoodie","$29","hoodie3"),
        Product("Black Hoodie","$29","hoodie4"),
        Product("Hoodies Gray","$28","hoodie1"),
        Product("Hoodies Red","$32","hoodie2"),
        Product("Blue Hoodie","$29","hoodie3"),
        Product("Black Hoodie","$29","hoodie4"),
        Product("Hoodies Gray","$28","hoodie1"),
        Product("Hoodies Red","$32","hoodie2"),
        Product("Blue Hoodie","$29","hoodie3"),
        Product("Black Hoodie","$29","hoodie4"),
    )

    val shirts = listOf(
        Product("Shirt Black","$18","shirt1"),
        Product("Badge Light Gray","$20","shirt2"),
        Product("Logo Shirt Red","$32","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Kickflip","$18","shirt5"),
        Product("Shirt Black","$18","shirt1"),
        Product("Badge Light Gray","$20","shirt2"),
        Product("Logo Shirt Red","$32","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Kickflip","$18","shirt5"),
        Product("Shirt Black","$18","shirt1"),
        Product("Badge Light Gray","$20","shirt2"),
        Product("Logo Shirt Red","$32","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Kickflip","$18","shirt5"),
        Product("Shirt Black","$18","shirt1"),
        Product("Badge Light Gray","$20","shirt2"),
        Product("Logo Shirt Red","$32","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Kickflip","$18","shirt5"),
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}