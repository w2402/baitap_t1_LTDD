package com.example.tuan3_bai1.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ComponentListScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Tiêu đề
        Text(
            text = "UI Components List",
            style = MaterialTheme.typography.headlineMedium,
            color = Color(0xFF2196F3),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nhóm Display
        Text(text = "Display", fontWeight = FontWeight.Bold, color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        ComponentItem("Text", "Displays text", Color(0xFFBBDEFB)) {
            navController.navigate("textDetail")
        }
        ComponentItem("Image", "Displays an image", Color(0xFFBBDEFB)) {
            navController.navigate("Image")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Nhóm Input
        Text(text = "Input", fontWeight = FontWeight.Bold, color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        ComponentItem("TextField", "Input field for text", Color(0xFFBBDEFB)) {
            navController.navigate("TextField")
        }
        ComponentItem("PasswordField", "Input field for passwords", Color(0xFFBBDEFB)) {
            navController.navigate("PasswordField")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Nhóm Layout
        Text(text = "Layout", fontWeight = FontWeight.Bold, color = Color.Gray)
        Spacer(modifier = Modifier.height(8.dp))
        ComponentItem("Column", "Arranges elements vertically", Color(0xFFBBDEFB)) {
            navController.navigate("Column")
        }
        ComponentItem("Row", "Arranges elements horizontally", Color(0xFFBBDEFB)) {
            navController.navigate("Row")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Mục tự tìm hiểu
        ComponentItem(
            "Tự tìm hiểu",
            "Tìm ra tất cả các thành phần UI Cơ bản",
            Color(0xFFFFCDD2)
        ) {
            // chưa có điều hướng, có thể để trống
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
