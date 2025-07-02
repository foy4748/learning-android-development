package com.example.greetingcard.task


import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.greetingcard.R

@Composable
fun TaskPicture(modifier: Modifier = Modifier) {
    val pic = painterResource(R.drawable.ic_task_completed)

    Image(
        painter = pic,
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.FillWidth,
    )
}
