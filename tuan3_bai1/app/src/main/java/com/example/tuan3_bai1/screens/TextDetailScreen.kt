package com.example.tuan3_bai1.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth


@Composable
fun TextDetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center, // Căn giữa theo chiều dọc
        horizontalAlignment = Alignment.CenterHorizontally // Căn giữa theo chiều ngang
    ) {
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black)) {
                    append("The ")
                }
                withStyle(style = SpanStyle(textDecoration = TextDecoration.LineThrough)) {
                    append("quick ")
                }
                withStyle(style = SpanStyle(color = Color(0xFF8B4513), fontWeight = FontWeight.Bold)) {
                    append("Brown ")
                }
                append("\nfox j u m p s ")
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("over ")
                }
                append("\nthe ")
                withStyle(style = SpanStyle(fontStyle = FontStyle.Italic)) {
                    append("lazy ")
                }
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("dog.")
                }
            },
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
    Text(
        text = "Text Detail",
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.headlineMedium,
        fontWeight = FontWeight.Bold,
        color = Color.Blue,
        modifier = Modifier.fillMaxWidth()
        .padding(50.dp)
    )
}
