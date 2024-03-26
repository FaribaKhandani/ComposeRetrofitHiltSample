package com.example.composeretrofithiltsample.api

data class ModelApi (

var articles: List<Article>,
val status: String,
var totalResults: Int
        )

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val title: String,
    val url: String,
    val urlToImage: String
)

data class Category(val name :String, var isSelected: Boolean =false)







