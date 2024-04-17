package com.example.composeretrofithiltsample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composeretrofithiltsample.api.Article
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ViewModelApi @Inject constructor(private val apiRepo: ApiRepo):ViewModel() {



    private val _newsStateFlow = MutableStateFlow<List<Article>>(emptyList())
    val newsStateFlow: StateFlow<List<Article>> = _newsStateFlow

    init {
        fetchNews()
    }

    fun fetchNews() {


        viewModelScope.launch(Dispatchers.IO) {

            val response = apiRepo.getNewsService()


            if (response.isSuccessful) {
                response.body()?.let { newsResponse ->
                    _newsStateFlow.value = newsResponse.articles
                }
            } else {
                _newsStateFlow.value = emptyList()
            }
        }
    }
}

