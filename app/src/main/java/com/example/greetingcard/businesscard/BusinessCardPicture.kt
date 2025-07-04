package com.example.greetingcard.businesscard


import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.greetingcard.R

@Composable
fun BusinessCardPicture(modifier: Modifier = Modifier, pictureId: Int = R.drawable.android_logo) {
    val pic = painterResource(pictureId)

    Image(
        painter = pic,
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Fit,
    )
}
