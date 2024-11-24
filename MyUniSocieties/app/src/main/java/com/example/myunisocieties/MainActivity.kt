package com.example.myunisocieties

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.my3pageapp.MyApp
import com.example.myunisocieties.ui.theme.MyUniSocietiesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyUniSocietiesTheme {
                MyApp() // The main app UI
            }
        }
    }
}