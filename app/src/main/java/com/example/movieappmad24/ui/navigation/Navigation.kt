package com.example.movieappmad24.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieappmad24.ui.screens.DetailScreen
import com.example.movieappmad24.ui.screens.HomeScreen
import com.example.movieappmad24.ui.screens.WatchlistScreen

sealed class Screen(val route: String) {
    data object Home: Screen("home")
    data object Detail: Screen("detail/{movieId}") {
        fun createRoute(movieId: String) = "detail/$movieId"
    }
    data object Watchlist: Screen("watchlist")
}

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = Screen.Home.route) {

        composable(route = Screen.Home.route){
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(navArgument(name = "movieId") {type = NavType.StringType})
        ) { backStackEntry ->
            DetailScreen(movieId = backStackEntry.arguments?.getString("movieId"), navController)
        }

        composable(
            route = Screen.Watchlist.route
        ) {
            WatchlistScreen(navController = navController)
        }
    }
}