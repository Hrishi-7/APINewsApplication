package com.hrishikesh.news.ui.models

import com.hrishikesh.news.ui.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)