package com.example.tuan2_bai3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tuan2_bai3.ui.theme.Tuan2_bai3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tuan2_bai3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AgeCheckScreen()
                }
            }
        }
    }
}

@Composable
fun AgeCheckScreen() {
    var name by remember { mutableStateOf("") }
    var ageText by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "THỰC HÀNH 01",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        // Ô nhập họ tên
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Họ và tên") },
            modifier = Modifier.fillMaxWidth(0.9f)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Ô nhập tuổi
        OutlinedTextField(
            value = ageText,
            onValueChange = { ageText = it },
            label = { Text("Tuổi") },
            modifier = Modifier.fillMaxWidth(0.9f)
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Nút kiểm tra
        Button(
            onClick = {
                val age = ageText.toIntOrNull()
                result = if (name.isBlank() || age == null) {
                    "Vui lòng nhập đầy đủ thông tin!"
                } else if (age > 65) {
                    "$name là người già."
                } else if (age in 6..65) {
                    "$name là người lớn."
                } else if (age in 2..6) {
                    "$name là trẻ em."
                } else {
                    "$name là em bé."
                }
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2196F3))
        ) {
            Text("Kiểm tra", color = Color.White)
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Hiển thị kết quả
        Text(
            text = result,
            fontSize = 18.sp,
            color = Color.Red,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}
