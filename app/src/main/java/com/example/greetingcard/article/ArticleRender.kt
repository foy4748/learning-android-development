package com.example.greetingcard.article

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ArticleTask() {

    Column(modifier = Modifier.fillMaxSize()) {

        ArticlePicture(modifier = Modifier.fillMaxWidth())
        ArticleText(modifier = Modifier.padding(24.dp))
    }

}
