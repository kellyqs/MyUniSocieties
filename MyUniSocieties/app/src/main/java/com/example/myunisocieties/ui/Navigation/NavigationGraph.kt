package com.example.myunisocieties.ui.Navigation


import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myunisocieties.ui.screens.FilmSociety
import com.example.myunisocieties.ui.screens.HomeScreen
import com.example.myunisocieties.ui.screens.SettingsScreen
import com.example.myunisocieties.ui.screens.SignUp
import com.example.myunisocieties.ui.screens.SocietiesList


@Composable
fun NavigationGraph(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("societyList") { SocietiesList(navController) }
        composable("filmSoc") { FilmSociety(navController) }
        composable("login") { Login(navController) }
        composable("signUp") { SignUp(navController) }
        composable("settings") { SettingsScreen(navController) }
    }
}

