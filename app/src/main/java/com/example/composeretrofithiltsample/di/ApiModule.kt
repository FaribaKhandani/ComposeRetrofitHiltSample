package com.example.composeretrofithiltsample.di

import com.example.composeretrofithiltsample.api.ApiService
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


@InstallIn(SingletonComponent::class)
@Module
object ApiModule {

    @Provides
    fun retrofitProvides():Retrofit{
        return Retrofit.Builder().
                baseUrl("https://newsapi.org/").
                addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @Provides
    fun apiServiceProvides(retrofit: Retrofit):ApiService{
        return retrofit.create(ApiService::class.java)
    }

}