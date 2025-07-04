package com.example.greetingcard.unocard

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun UnoRandomCardRender() {
    val (cardColor, cardSymbol) = UnoCard.getRandomCard()
    val padding : Dp = 30.dp
    val fontSize : TextUnit = 100.sp

    // Card Oval
    Box {
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
                    fontSize = fontSize,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(padding)
                )
            }
            Row(
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
                    fontSize = fontSize,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(padding)
                        .rotate(180f)
                )
            }

        }

        Box{
            // Oval
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Transparent)
            ) {
                Canvas(
                    modifier = Modifier
//                    .size(200.dp)
                        .fillMaxSize()
                        .rotate(45f) // Rotate the oval diagonally
                ) {
                    drawOval(
                        color = Color.White, // Change to your desired color
                        topLeft = Offset.Zero,
                        size = size,
                        style = Stroke(width = 40.dp.toPx()) // Outline thickness
                    )
                }
            }
            // END of Oval

            // Mid Text
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Transparent)

            ){
                val largeFont : TextUnit = 200.sp
                Text(
                    text = cardSymbol,
                    color = Color(0xFFFFFFFF),
                    fontSize = largeFont,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(padding)
                )

            }
            // END Mid Text
        }

    }

    // Card Base
}