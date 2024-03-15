package com.example.movieappmad24.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.movieappmad24.ui.widgets.ImageCarousel
import com.example.movieappmad24.ui.movie.MovieRow
import com.example.movieappmad24.ui.navigation.SimpleBottomAppBar
import com.example.movieappmad24.ui.navigation.SimpleTopAppBar
import com.example.movieappmad24.models.Movie
import com.example.movieappmad24.models.getMovieById

@Composable
fun DetailScreen(movieId: String?, navController: NavController) {
    var movie: Movie? = null

    if( movieId != null) {
        movie = getMovieById(movieId);
    }

    Scaffold(
        topBar = { SimpleTopAppBar(
            title = movie?.title ?: "Movie detail",
            navController
        ) },
        bottomBar = { SimpleBottomAppBar(navController) }
    ) { paddingValues ->
        Surface(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            color = MaterialTheme.colorScheme.background
        ) {
            Column{
                if(movie != null) {
                    MovieRow(movie)
                    ImageCarousel(movie)
                } else Text("Movie not found!")
            }
        }
    }
}