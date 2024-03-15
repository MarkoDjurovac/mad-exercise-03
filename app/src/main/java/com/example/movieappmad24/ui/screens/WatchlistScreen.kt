package com.example.movieappmad24.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.movieappmad24.ui.movie.MovieList
import com.example.movieappmad24.ui.navigation.SimpleBottomAppBar
import com.example.movieappmad24.ui.navigation.SimpleTopAppBar
import com.example.movieappmad24.models.getMovies

@Composable
fun WatchlistScreen(navController: NavController) {
    Scaffold(
        topBar = { SimpleTopAppBar("Your Watchlist") },
        bottomBar = { SimpleBottomAppBar(navController) }
    ) { paddingValues ->
        Surface(
            modifier = Modifier.fillMaxSize().padding(paddingValues),
            color = MaterialTheme.colorScheme.background
        ) {
            MovieList(
                movies = getMovies(),
                navController = navController
            )
        }
    }
}