package com.example.faa.ui.ui.home

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.compose.FAATheme
import com.example.faa.ui.ui.componants.MainPageTopAppBar

@Composable
fun HomeScreen(navController: NavHostController) {
    val isDarkMode = remember { mutableStateOf(false) }

    // Define light and dark color schemes
//    val lightColors = lightColorScheme()
//    val darkColors = darkColorScheme()

    // Switch the theme dynamically
    My3pageappTheme(
        darkTheme = isDarkMode.value
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Image display
//            Image(
//                painter = painterResource(id = R.drawable.home_image), // Replace with your image resource
//                contentDescription = "Home Image",
//                modifier = Modifier.size(150.dp) // Set desired size
//            )
//
//            Spacer(modifier = Modifier.height(20.dp))

            // Text
            Text("This is the Home Screen")

            Spacer(modifier = Modifier.height(20.dp))

            // Dark mode toggle switch
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Dark Mode")
                Spacer(modifier = Modifier.width(8.dp))
                Switch(
                    checked = isDarkMode.value,
                    onCheckedChange = { isDarkMode.value = it }
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Navigation Button
            Button(onClick = { navController.navigate("profile") }) {
                Text("Go to Profile")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MyUniSocietiesTheme {
        HomeScreen(navController = rememberNavController())  // Sample preview with mock navController
    }
}