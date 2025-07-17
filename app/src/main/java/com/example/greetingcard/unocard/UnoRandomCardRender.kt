package com.example.greetingcard.unocard

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    val (initialCardColor, initialCardSymbol) = UnoCard.getRandomCard()
    var cardColor by remember { mutableLongStateOf(initialCardColor) }
    var cardSymbol by remember { mutableStateOf(initialCardSymbol) }
    val padding: Dp = 30.dp
    val fontSize: TextUnit = 100.sp

    // Card Oval
    Box {

        // Card Base
        // Numbers at the corners
        // and Background Color
        Column {
            // Upper Part
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
            // Lower Part
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

        // Mid Section
        Box {
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
                        .rotate(30f) // Rotate the oval diagonally
                ) {
                    drawOval(
                        color = Color.White, // Change to your desired color
                        topLeft = Offset.Zero,
                        size = size,
                        style = Stroke(width = 30.dp.toPx()) // Outline thickness
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

            ) {
                val largeFont: TextUnit = 200.sp
                Text(
                    text = cardSymbol,
                    color = Color(0xFFFFFFFF),
                    fontSize = largeFont,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(padding)
                )
                Spacer(Modifier.height(10.dp))
                Button(
                    onClick = {
                        val (newCardColor, newCardSymbol) = UnoCard.getRandomCard()
                        cardColor = newCardColor
                        cardSymbol = newCardSymbol
                    },
//                    colors = ButtonDefaults.buttonColors(),
//                    colors = ButtonColors(
//                        containerColor = MaterialTheme.colorScheme.primaryContainer ,
//                        contentColor =  MaterialTheme.colorScheme.primary,
//                        disabledContainerColor = Color(0xEEEEEEEE),
//                        disabledContentColor = Color(0x00000000),
//                    ),
                    modifier = Modifier
                        .height(50.dp)
                        .width(100.dp)
                ) {
                    Text(text = "Shuffle", fontWeight = FontWeight.Bold)
                }

            }
            // END Mid Text
        }

    }

}