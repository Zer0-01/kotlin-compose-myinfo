package com.example.kotlin_compose_myinfo

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlin_compose_myinfo.ui.home.view.HomeView
import com.example.kotlin_compose_myinfo.ui.splash.view.SplashView

@Composable
fun NavigationStack() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = Screen.Splash.route) {
        composable(route = Screen.Splash.route) {
            SplashView(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeView(navController = navController)
        }
    }

}