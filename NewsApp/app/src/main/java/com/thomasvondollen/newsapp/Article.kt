package com.thomasvondollen.newsapp

data class Article(val source:Source,
                   val author:String?,
                   val title:String,
                   val description:String,
                   val url:String,
                   val urlToImage:String?,  //URL to relevant image in article
                   val publishedAt:String,  //publish date and time
                   val content:String
                   )