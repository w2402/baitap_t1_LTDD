package com.example.tuan3_bai1.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign



@Composable
fun TextFieldScreen(onBack: () -> Unit) {
    var text by remember { mutableStateOf("") }

    Text(
        text = "Text Field",
        modifier = Modifier
            .fillMaxWidth()
            .padding(50.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium,
        fontWeight = FontWeight.Bold,
        color = Color.Blue
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa ngang
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(

            value = text,
            onValueChange = { text = it },
            label = { Text("Thông tin nhập") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = if (text.isEmpty()) "Tự động cập nhật dữ liệu theo textfield" else text,
            color = Color.Red
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = onBack) {
            Text("Quay lại")
        }

    }
}
