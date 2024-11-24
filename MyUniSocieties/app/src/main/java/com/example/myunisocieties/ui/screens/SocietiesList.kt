package com.example.myunisocieties.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun SocietiesList(navController: NavHostController) {
    Scaffold(
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                verticalArrangement = Arrangement.SpaceEvenly, // Even spacing between items
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Title Text
                Text(
                    text = "List of Societies:",
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 16.dp)
                )


                Button(
                    onClick = { navController.navigate("filmSoc") },
                    modifier = Modifier.fillMaxWidth(0.8f)
                ) {
                    Text("Film Society")
                }


                Button(

                    modifier = Modifier.fillMaxWidth(0.8f)
                ) {
                    Text("TUS Engineering Ireland Society")
                }



                // Button 3: Anime Society
                Button(

                    modifier = Modifier.fillMaxWidth(0.8f)
                ) {
                    Text("Anime Society")
                }

                // Button 4: International Society
                Button(

                    modifier = Modifier.fillMaxWidth(0.8f)
                ) {
                    Text("International Society")
                }
            }
        }
    )
}
