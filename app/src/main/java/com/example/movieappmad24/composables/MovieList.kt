package com.example.movieappmad24.composables

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.movieappmad24.models.Movie
import com.example.movieappmad24.models.getMovies

@Composable
fun MovieList(movies: List<Movie> = getMovies()){
    LazyColumn {
        items(movies) { movie ->
            MovieRow(movie)
        }
    }
}