package com.example.kotlin_compose_myinfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.kotlin_compose_myinfo.navigation.NavigationStack
import com.example.kotlin_compose_myinfo.ui.theme.Kotlin_compose_myinfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Kotlin_compose_myinfoTheme {
                NavigationStack()
            }
        }
    }
}