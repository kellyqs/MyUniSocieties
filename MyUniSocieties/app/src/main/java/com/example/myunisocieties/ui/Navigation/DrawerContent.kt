package com.example.myunisocieties.ui.Navigation


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.material3.DrawerState
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController


@Composable
fun DrawerContent(navController: NavHostController, drawerState: DrawerState) {
    val coroutineScope = rememberCoroutineScope()

    Column {
        Text("Navigate to:")

        // Home item
        TextButton(onClick = {
            coroutineScope.launch {
                drawerState.close()  // Close the drawer first
                navController.navigate("home")  // Then navigate to home
            }
        }) {
            Text("Home")
        }

        // Societies List item
        TextButton(onClick = {
            coroutineScope.launch {
                drawerState.close()  // Close the drawer first
                navController.navigate("societyList")  // Then navigate to profile
            }
        }) {
            Text("societies")
        }
        TextButton(onClick = {
            coroutineScope.launch {
                drawerState.close()  // Close the drawer first
                navController.navigate("filmSoc")  // Then navigate to profile
            }
        }) {
            Text("Film Society")
        }


        // Societies List item
        TextButton(onClick = {
            coroutineScope.launch {
                drawerState.close()  // Close the drawer first
                navController.navigate("login")  // Then navigate to profile
            }
        }) {
            Text("login")
        }

        // Societies List item
        TextButton(onClick = {
            coroutineScope.launch {
                drawerState.close()  // Close the drawer first
                navController.navigate("signUp")  // Then navigate to profile
            }
        }) {
            Text("signUp")
        }

        // Settings item
        TextButton(onClick = {
            coroutineScope.launch {
                drawerState.close()  // Close the drawer first
                navController.navigate("settings")  // Then navigate to settings
            }
        }) {
            Text("Settings")
        }
    }
}

