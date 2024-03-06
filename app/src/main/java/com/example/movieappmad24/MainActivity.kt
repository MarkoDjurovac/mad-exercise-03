package com.example.movieappmad24

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.movieappmad24.composables.*
import com.example.movieappmad24.models.getMovies
import com.example.movieappmad24.ui.theme.MovieAppMAD24Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieAppMAD24Theme {
                MainContent()
            }
        }
    }

    @Composable
    fun MainContent() {
        Scaffold(
            topBar = { TopBar() },
            bottomBar = { BottomNavigationBar() }
        ) { paddingValues ->
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize().padding(paddingValues),
                color = MaterialTheme.colorScheme.background
            ) {
                MovieList(movies = getMovies())
            }
        }
    }
}