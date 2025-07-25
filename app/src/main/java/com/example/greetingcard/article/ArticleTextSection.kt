package com.example.greetingcard.article

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ArticleText(modifier: Modifier = Modifier) {

    Column(verticalArrangement = Arrangement.spacedBy(18.dp), modifier = modifier) {
        // Title
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        // Paragraph 1
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            fontSize = 12.sp,
            textAlign = TextAlign.Justify
        )
        // Paragraph 2
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            fontSize = 12.sp,
            textAlign = TextAlign.Justify
        )
    }
}