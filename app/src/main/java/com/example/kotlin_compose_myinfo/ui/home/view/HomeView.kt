package com.example.kotlin_compose_myinfo.ui.home.view

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeView(navController: NavController) {
    Scaffold { innerPadding ->
        Text(text = "Home View", modifier = Modifier.padding(innerPadding))
    }
}