package com.example.tuan3_bai1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tuan3_bai1.screens.*
@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "Welcome") {
        composable("Welcome") { WelcomeScreen(navController) }
        composable("Components") { ComponentListScreen(navController) }
        composable("textDetail") { TextDetailScreen() }
        composable("Row") { RowLayoutScreen(onBack = { navController.popBackStack() }) }
        composable("Image") { ImageScreen(onBack = { navController.popBackStack() }) }
        composable("TextField") { TextFieldScreen(onBack = { navController.popBackStack() }) }
        composable("Column") { ColumnLayoutScreen (onBack = { navController.popBackStack() }) }
        composable("PasswordField") { PasswordFieldScreen(onBack = { navController.popBackStack() }) }
        }
}






