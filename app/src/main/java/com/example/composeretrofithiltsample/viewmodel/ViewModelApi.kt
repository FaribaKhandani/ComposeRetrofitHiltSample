package com.example.composeretrofithiltsample.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ViewModelApi @Inject constructor(private val apiRepo: ApiRepo):ViewModel() {



    fun fetchNews(category: String){
        viewModelScope.launch(Dispatchers.IO){

        }

    }
}