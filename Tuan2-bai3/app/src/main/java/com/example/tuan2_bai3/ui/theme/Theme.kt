package com.example.tuan2_bai3.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun Tuan2_bai3Theme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = lightColorScheme(),
        typography = Typography,
        content = content
    )
}
