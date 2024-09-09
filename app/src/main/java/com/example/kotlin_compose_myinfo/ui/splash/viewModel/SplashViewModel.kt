package com.example.kotlin_compose_myinfo.ui.splash.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.example.kotlin_compose_myinfo.Screen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel(val navController: NavController): ViewModel() {

    fun navigateToHome() {
        viewModelScope.launch {
            delay(5000)
            navController.navigate(route = Screen.Home.route)        }
    }
}