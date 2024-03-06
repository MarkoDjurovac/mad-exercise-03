package com.example.movieappmad24.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movieappmad24.models.Movie

@Composable
fun MovieRow(movie: Movie) {
    var showDetails by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = ShapeDefaults.Large,
        elevation = CardDefaults.cardElevation(10.dp)
    ) {
        Column {
            MoviePosterBox(movie)
            MovieInfoRow(movie, showDetails) { showDetails = !showDetails }
            AnimatedVisibility(visible = showDetails) {
                MovieDetails(movie)
            }
        }
    }
}