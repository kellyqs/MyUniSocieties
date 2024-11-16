package com.example.my3pageapp.navigation


import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.faa.ui.ui.home.HomeScreen
import com.example.faa.ui.ui.home.ProfileScreen
import com.example.faa.ui.ui.home.SettingsScreen


@Composable
fun NavigationGraph(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("societies") { ProfileScreen(navController) }
        composable("settings") { SettingsScreen(navController) }
    }
}
