package com.example.myunisocieties.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myunisocieties.R
import com.example.myunisocieties.ui.theme.MyUniSocietiesTheme

@Composable
fun HomeScreen(navController: NavHostController) {


    MyUniSocietiesTheme(

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(id = R.drawable.universitylogo), // Replace with your app's logo or image
                contentDescription = "University Logo",
                modifier = Modifier.size(120.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Text(
                text = "Welcome to MyUniSocieties!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Discover, join, and connect with vibrant societies at your university! " +
                        "Explore opportunities to meet like-minded peers, develop skills, " +
                        "and make your university experience unforgettable.",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))



            Button(
                onClick = { navController.navigate("societyList") },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(0.8f)
            ) {
                Text("Explore Societies", fontSize = 18.sp, color = Color.White)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Enable Dark Mode", fontSize = 16.sp)
                Spacer(modifier = Modifier.width(8.dp))
                Switch(
                    checked = isDarkMode.value,
                    onCheckedChange = { isDarkMode.value = it }
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MyUniSocietiesTheme {
        HomeScreen(navController = rememberNavController()) // Sample preview with mock navController
    }
}
