package com.example.greetingcard.birthdaycard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun BirthdayGreeting(
    name: String,
    birthdayWish: String,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "Happy Birthday, $name",
            modifier = textModifier,
            fontSize = 36.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text(
            text = birthdayWish,
            modifier = textModifier,
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }

}
