package com.example.baitaptailop.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ListScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "UI Components List",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF2196F3),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Demo Column & LazyColumn", fontWeight = FontWeight.Bold, color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))

        ComponentItem("Column Demo", "Hiển thị 1 triệu dòng bằng Column", Color(0xFFFFE0B2)) {
            navController.navigate("ColumnExample")
        }

        ComponentItem("LazyColumn Demo", "Hiển thị 1 triệu dòng bằng LazyColumn", Color(0xFFFFE0B2)) {
            navController.navigate("LazyColumnExample")
        }

        ComponentItem(
            "Return Demo",
            "Mở màn hình mới rồi quay lại ListScreen",
            Color(0xFFC8E6C9)
        ) {
            navController.navigate("ReturnScreen")
        }

    }
}

@Composable
fun ComponentItem(title: String, description: String, bgColor: Color, onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(bgColor, shape = RoundedCornerShape(8.dp))
            .padding(12.dp)
            .clickable { onClick() }
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = description,
            color = Color.DarkGray,
            fontSize = 14.sp
        )
    }
    Spacer(modifier = Modifier.height(8.dp))
}
