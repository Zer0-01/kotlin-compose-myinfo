package com.example.kotlin_compose_myinfo.navigation

sealed class Screen(val route: String) {
    data object Splash : Screen("splash")
    data object Home : Screen("home")
    data object Population : Screen("population")
    data object Transportation : Screen("transportation")
}