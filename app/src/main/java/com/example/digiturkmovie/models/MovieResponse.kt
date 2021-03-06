package com.example.digiturkmovie.models

data class MovieResponse(
    val page: Int,
    val results: List<MovieItem>,
    val total_pages: Int,
    val total_results: Int
)