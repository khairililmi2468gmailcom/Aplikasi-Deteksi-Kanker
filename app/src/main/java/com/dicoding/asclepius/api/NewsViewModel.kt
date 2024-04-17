package com.dicoding.asclepius.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewsViewModel : ViewModel() {
    private val newsRepository = NewsRepository()
    private val _newsList = MutableLiveData<List<NewsItem>>()
    val newsList: LiveData<List<NewsItem>> = _newsList

    fun fetchHealthNews() {
        newsRepository.getHealthNews(
            onSuccess = { newsList ->
                _newsList.postValue(newsList)
            },
            onFailure = { errorMessage ->
            }
        )
    }
}
