package com.example.greetingcard.quadrant

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Quadrant() {

    val weight = 1f

    // Layout
    Column(modifier = Modifier.fillMaxSize().padding()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .weight(weight)
        ) {
            SingleTextUnit(
                title = "Text composable",
                text = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
            )
            SingleTextUnit(
                title = "Image composable",
                text = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
            )

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .weight(weight)
        ) {
            SingleTextUnit(
                title = "Row composable",
                text = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
            )
            SingleTextUnit(
                title = "Column composable",
                text = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
            )

        }
    }
}
