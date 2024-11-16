package com.example.my3pageapp.navigation


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
                navController.navigate("societies")  // Then navigate to profile
            }
        }) {
            Text("societies")
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
