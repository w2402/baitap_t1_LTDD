package com.example.baitaptailop

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.baitaptailop.Screens.*

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = "WelcomeScreen") {
        composable("WelcomeScreen") { WelcomeScreen(navController) }
        composable("ListScreen") { ListScreen(navController) }
        composable("ColumnExample") { ColumnScreen(onBack = { navController.popBackStack() }) }
        composable("LazyColumnExample") { LazyColumnScreen(onBack = { navController.popBackStack() }) }
        composable("ReturnScreen") { ReturnScreen(navController) }


    }
}
