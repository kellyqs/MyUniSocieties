package com.example.my3pageapp

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.myunisocieties.ui.Navigation.DrawerContent
import com.example.myunisocieties.ui.Navigation.NavigationGraph
import com.example.myunisocieties.ui.theme.MyUniSocietiesTheme

import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    // State for the drawer
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()
    val navController = rememberNavController()

    // ModalNavigationDrawer setup
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                // Pass drawerState and navController to DrawerContent
                DrawerContent(navController = navController, drawerState = drawerState)
            }
        }
    ) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("University Societies") },
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                // Toggle the drawer state when the menu button is clicked
                                if (drawerState.isClosed) {
                                    drawerState.open()
                                } else {
                                    drawerState.close()
                                }
                            }
                        }) {
                            Icon(Icons.Filled.Menu, contentDescription = "Menu Icon")
                        }
                    }
                )
            }
        ) { paddingValues ->
            // Navigation graph that handles routing between screens
            NavigationGraph(navController = navController, paddingValues)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    MyUniSocietiesTheme {
        MyApp()
    }
}
