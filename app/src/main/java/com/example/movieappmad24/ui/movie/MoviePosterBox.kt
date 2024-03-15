package com.example.movieappmad24.ui.movie

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.movieappmad24.ui.icons.FavoriteIcon
import com.example.movieappmad24.models.Movie

@Composable
fun MoviePosterBox(movie: Movie) {
    Box(
        modifier = Modifier
            .height(150.dp)
            .height(IntrinsicSize.Min),
        contentAlignment = Alignment.Center
    ) {
        MoviePoster(movie.title, movie.images)
        FavoriteIcon()
    }
}