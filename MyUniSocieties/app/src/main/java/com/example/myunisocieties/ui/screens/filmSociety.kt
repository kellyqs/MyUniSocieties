package com.example.myunisocieties.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myunisocieties.ui.theme.MyUniSocietiesTheme

@Composable
fun FilmSociety(navController: NavHostController) {
    Scaffold(
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                // Title
                Text(
                    text = "Film Society",
                    style = MaterialTheme.typography.headlineMedium.copy(fontSize = 28.sp, fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Description
                Text(
                    text = "Welcome to the Film Society! We are passionate about movies and host weekly screenings, discussions, and workshops for film enthusiasts.",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Activities Section
                Text(
                    text = "Activities:",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "• Weekly film screenings\n" +
                            "• Discussions with guest speakers\n" +
                            "• Filmmaking workshops\n" +
                            "• Annual short film competition",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)
                )


                Text(
                    text = "Contact Us For More Information:",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Text(
                    text = "Email: K00299565@student.tus.ie",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(bottom = 16.dp)
                )


                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { navController.navigate("societyList") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text("Back to Societies List")
                }
            }
        }
    )
}

// Optional Preview for Testing
@Preview(showBackground = true)
@Composable
fun FilmSocietyPreview() {
    MyUniSocietiesTheme {
        FilmSociety(navController = rememberNavController())
    }
}
