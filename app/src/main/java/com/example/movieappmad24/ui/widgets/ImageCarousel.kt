package com.example.movieappmad24.ui.widgets

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.movieappmad24.models.Movie

@Composable
fun ImageCarousel(movie: Movie) {
    LazyRow {
        items(movie.images) { imageUrl ->
            Card(
                modifier = Modifier.padding(4.dp)
            ) {
                AsyncImage(
                    model = imageUrl,
                    contentDescription = movie.title,
                    modifier = Modifier.size(width = 360.dp, height = 180.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}