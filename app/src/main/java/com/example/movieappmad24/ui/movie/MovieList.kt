package com.example.movieappmad24.ui.movie

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.movieappmad24.models.Movie
import com.example.movieappmad24.models.getMovies
import com.example.movieappmad24.ui.navigation.Screen

@Composable
fun MovieList(movies: List<Movie> = getMovies(), navController: NavController) {
    LazyColumn {
        items(movies) { movie ->
            MovieRow(movie) {
                navController.navigate(Screen.Detail.createRoute(movieId = movie.id))
            }
        }
    }
}