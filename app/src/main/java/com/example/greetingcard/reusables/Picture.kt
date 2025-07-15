package com.example.greetingcard.reusables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

@Composable
fun Picture(
    @DrawableRes id: Int,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.Crop,
    alpha: Float = 1.0F,
) {

    val image = painterResource(id)
    Image(
        painter = image,
        modifier = modifier,
        contentDescription = contentDescription,
        contentScale = contentScale,
        alpha = alpha,
//        modifier = Modifier
//            .fillMaxWidth()
//            .fillMaxHeight()
//            .wrapContentWidth(Alignment.CenterHorizontally)
//            .wrapContentHeight(Alignment.CenterVertically)
    )
}
