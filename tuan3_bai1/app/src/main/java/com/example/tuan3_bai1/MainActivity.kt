package com.example.tuan3_bai1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.tuan3_bai1.ui.theme.Tuan3_bai1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuan3_bai1Theme {
                enableEdgeToEdge()
                val navController = rememberNavController()
                AppNavigation(navController)
            }
        }
    }
}