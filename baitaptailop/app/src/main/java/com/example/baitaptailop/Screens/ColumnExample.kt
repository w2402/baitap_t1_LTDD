package com.example.baitaptailop.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun ColumnScreen(onBack: () -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = onBack) {
            Text("Quay lại")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column {
            for (i in 1..1_000_000) {
                Text(text = "Trần Ngọc Đông (Column) - $i")
            }
        }
    }
}
