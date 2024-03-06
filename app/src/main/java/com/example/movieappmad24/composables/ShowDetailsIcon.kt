package com.example.movieappmad24.composables

import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ShowDetailsIcon(showDetails: Boolean, onClick: () -> Unit) {
    Icon(
        modifier = Modifier.clickable { onClick() },
        imageVector = if (showDetails) Icons.Filled.KeyboardArrowDown else Icons.Default.KeyboardArrowUp,
        contentDescription = "Show more"
    )
}