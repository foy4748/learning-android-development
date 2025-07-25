package com.example.greetingcard.birthdaycard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.greetingcard.R

@Composable
fun BirthdayCardRender(name: String, birthdayWish: String, modifier: Modifier = Modifier) {
    Box(modifier) {
        BirthdayCardPicture()
        BirthdayGreeting(
            name,
            birthdayWish,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .wrapContentHeight(Alignment.CenterVertically)
//                .background(color = Color.Green)
//                .align(alignment = Alignment.CenterEnd)
                .padding(10.dp),
        )

    }
}
