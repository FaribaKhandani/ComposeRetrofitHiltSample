package com.example.composeretrofithiltsample.viewmodel

import com.example.composeretrofithiltsample.api.ApiService
import com.example.composeretrofithiltsample.api.ModelApi
import com.example.composeretrofithiltsample.di.ApiModule
import retrofit2.Response
import javax.inject.Inject

class ApiRepo @Inject constructor(private val apiService: ApiService) {

 suspend fun  getNewsService(): Response<ModelApi> {
     return apiService.getNews()
 }
}