package com.example.movieappmad24.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun SimpleBottomAppBar(navController: NavController) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        contentColor = MaterialTheme.colorScheme.primary,
    ) {
        val items = listOf("Home", "Watchlist")
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    when (item) {
                        "Home" -> Icon(Icons.Filled.Home, contentDescription = "Home")
                        "Watchlist" -> Icon(Icons.Filled.Star, contentDescription = "Watchlist")
                    }
                },
                label = { Text(item) },
                selected = false,
                onClick = {
                    when (item) {
                        "Home" -> navController.navigate(Screen.Home.route)
                        "Watchlist" -> navController.navigate(Screen.Watchlist.route)
                    }
                }
            )
        }
    }
}