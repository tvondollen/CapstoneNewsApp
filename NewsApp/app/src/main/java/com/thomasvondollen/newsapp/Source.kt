package com.thomasvondollen.newsapp

import com.thomasvondollen.newsapp.models.Category
import com.thomasvondollen.newsapp.models.Country
import com.thomasvondollen.newsapp.models.Language

data class Source(val id:String?, //nullable
                  val name:String,
                  /*val description:String,
                  val url:String,*/
                  val category: Category,
                  val language: Language,
                  val country:Country
                  )