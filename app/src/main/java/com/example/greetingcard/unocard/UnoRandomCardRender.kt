package com.example.greetingcard.unocard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun UnoRandomCardRender() {
    val (cardColor, cardSymbol) = UnoCard.getRandomCard()
    val padding = 30.dp
    Column {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
            .background(Color(cardColor))
                .fillMaxSize()
                .weight(1f)
        ) {
            Text(
                text = cardSymbol,
                color = Color(0xFFFFFFFF),
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(padding)
            )
        }
        Row (
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Bottom,
            modifier = Modifier
                .background(Color(cardColor))
                .fillMaxSize()
                .weight(1f)
        ) {
            Text(
                text = cardSymbol,
                color = Color(0xFFFFFFFF),
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(padding)
            )
        }

    }
}