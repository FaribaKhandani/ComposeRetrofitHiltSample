package com.example.composeretrofithiltsample.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines/?country=us&apiKey=d3ae919bc8bd4ce2b3fd7c7913f9336c")
    suspend fun  getNews(): Response<ModelApi>
}