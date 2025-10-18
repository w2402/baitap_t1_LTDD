package com.example.baitaptailop.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnScreen(onBack: () -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = onBack) {
            Text("Quay lại")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(1_000_000) { i ->
                Text(
                    text = "Trần Ngọc Đông - $i",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}
