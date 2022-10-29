package com.example.android_app_2022.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ui_top.TopScreen

@Composable
fun Android2022App() {
    Androidapp2022Theme {
        NavHost(
            navController = rememberNavController(),
            startDestination = "top"
        ) {
            composable("top") {
                TopScreen()
            }
        }
    }
}
