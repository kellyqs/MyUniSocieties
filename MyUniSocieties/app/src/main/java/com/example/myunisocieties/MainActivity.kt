package com.example.myunisocieties


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