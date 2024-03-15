package com.example.movieappmad24.ui.movie

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage

@Composable
fun MoviePoster(title: String, images: List<String>) {
    if (images.isNotEmpty()) {
        val randomPoster = remember{ images.random() }
        AsyncImage(
            model = randomPoster,
            contentDescription = title,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}