package com.example.tuan3_bai1.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.tuan3_bai1.R



@Composable
fun WelcomeScreen(navController: NavHostController) {
    Scaffold { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.p1),
                contentDescription = null,
                modifier = Modifier.size(200.dp)
                .padding(bottom = 16.dp)
            )
            Text("Jetpack Compose", style = MaterialTheme.typography.headlineMedium)
            Text(
                "jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { navController.navigate("components") }) {
                Text("I'm Ready")
            }
        }
    }
}