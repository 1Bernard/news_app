package com.example.newsapp.domain.usecases.news

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepository

class InsertArticle(
    private val newsRepository: NewsRepository
) {
    suspend operator fun invoke(article: Article) {
        newsRepository.insertArticle(article)
    }
}