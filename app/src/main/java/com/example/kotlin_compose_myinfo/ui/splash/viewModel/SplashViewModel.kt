package com.example.kotlin_compose_myinfo.ui.splash.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {

    fun startTimer(onTimeOut: () -> Unit) {
        viewModelScope.launch {
            delay(5000)
            onTimeOut()
        }
    }
}