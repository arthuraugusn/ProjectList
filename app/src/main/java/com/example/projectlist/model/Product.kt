package com.example.projectlist.model

data class Product(
    val id: Int,
    val productName: String,
    val productPrice: Double,
    val productDescription: String,
    val imageId: Int = 0
)
