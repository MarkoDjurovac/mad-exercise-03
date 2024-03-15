package com.example.movieappmad24.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.movieappmad24.ui.widgets.ImageCarousel
import com.example.movieappmad24.ui.movie.MovieRow
import com.example.movieappmad24.ui.navigation.SimpleBottomAppBar
import com.example.movieappmad24.ui.navigation.SimpleTopAppBar
import com.example.movieappmad24.models.getMovies

@Composable
fun DetailScreen(movieId: String?, navController: NavController) {
    if (movieId != null) {
        val movie = getMovies().find { it.id == movieId }
        if (movie != null) {
            Scaffold(
                topBar = { SimpleTopAppBar(
                    title = movie.title,
                    navController
                ) },
                bottomBar = { SimpleBottomAppBar(navController) }
            ) { paddingValues ->
                Surface(
                    modifier = Modifier.fillMaxSize().padding(paddingValues),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        MovieRow(movie)
                        ImageCarousel(movie)
                    }
                }
            }
        }
    }
}