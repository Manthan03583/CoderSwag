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
        Product("Graphic Beanie","$18","hat01"),
        Product("Hat Black","$20","hat02"),
        Product("Hat White","$18","hat03"),
        Product("Hat Snapback","$22","hat04"),
    )

    val hoodies = listOf(
        Product("Hoodies Gray","$28","hoodies01"),
        Product("Hoodies Red","$32","hoodies02"),
        Product("Blue Hoodie","$29","hoodies03"),
        Product("Black Hoodie","$29","hoodies04")
    )

    val shirts = listOf(
        Product("Shirt Black","$18","shirt01"),
        Product("Badge Light Gray","$20","shirt02"),
        Product("Logo Shirt Red","$32","shirt03"),
        Product("Hustle","$22","shirt04"),
        Product("Kickflip","$18","shirt05")
    )
}