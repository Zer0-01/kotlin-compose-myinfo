package com.example.kotlin_compose_myinfo.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.slideInHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlin_compose_myinfo.ui.home.view.HomeView
import com.example.kotlin_compose_myinfo.ui.population.view.PopulationView
import com.example.kotlin_compose_myinfo.ui.splash.view.SplashView

@Composable
fun NavigationStack() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {
        composable(route = Screen.Splash.route) {
            SplashView(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeView(navController = navController)
        }
        composable(route = Screen.Population.route) {
            PopulationView()
        }
    }

}