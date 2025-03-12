package com.bendis.data.entity

data class ProductsAddedToCart (
    val productImage : Int,
    val productName : String,
    val productOldPrice : Double,
    val productCurrentPrice : Double,
    val productCount : Int
)