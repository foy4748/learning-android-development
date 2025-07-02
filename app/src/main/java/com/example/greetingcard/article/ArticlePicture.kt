package com.example.greetingcard.article

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.greetingcard.R

@Composable
fun ArticlePicture(modifier: Modifier = Modifier) {
    val pic = painterResource(R.drawable.bg_compose_background)

    Image(
        painter = pic,
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.FillWidth,
    )
}