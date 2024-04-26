package com.example.composeretrofithiltsample.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composeretrofithiltsample.api.Article
import com.example.composeretrofithiltsample.viewmodel.ViewModelApi


@Composable

fun MyScreen(){
    val viewModelApi:ViewModelApi = viewModel()
    val article by viewModelApi.newsStateFlow.collectAsState()

    article.let {
        ArticleList(article = it)
    }

}

@Composable
fun ArticleList(articles: List<Article>){

    LazyColumn(){
        items(articles){
                articles ->
            ArticleItem(article =articles)

        }
    }
}


@Composable
fun ArticleItem(article: Article){

}