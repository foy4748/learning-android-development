package com.example.greetingcard.artgallery

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.sharp.ArrowBackIos
import androidx.compose.material.icons.automirrored.sharp.ArrowForwardIos
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.reusables.Picture


@Preview(showBackground = true)
@Composable
fun ArtGalleryRender() {
    var currentIndex by remember { mutableIntStateOf(0) }
    val data = GalleryData
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
    ) {
        Box {
            Picture(
                id = data[currentIndex].resourceId, modifier = Modifier
                    .border(
                        width = 2.dp,
                        color = Color.DarkGray,
//                        shape = RoundedCornerShape(8.dp) // Optional rounded corners
                    )
                    .padding(10.dp)
                    .background(
                        Color.White
                    )
            )

        }

        Column(
            modifier = Modifier
                .padding(30.dp)
                .background(Color(0x4F30D6FF))
                .padding(20.dp)
        ) {

            if (data[currentIndex].location is String) {
                Text(
                    text = data[currentIndex].location as String,
                    softWrap = true
                )
                Spacer(Modifier.height(30.dp))
            }
            Text(
                text = data[currentIndex].licenseType,
                softWrap = true,
                fontStyle = FontStyle.Italic
            )
        }

        // Slider Previous / Next Buttons
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
        ) {
            // Previous Button
            Button(
                onClick = {
                    currentIndex--
                    if (currentIndex < 0) currentIndex = data.size - 1
                },
                content = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Sharp.ArrowBackIos,
                            contentDescription = "Go to Previous Picture"
                        )
                        Text(text = "Previous")

                    }
                },
                modifier = Modifier.width(140.dp)
            )

            // Next Button
            Button(
                onClick = {
                    currentIndex++
                    currentIndex = currentIndex % data.size
                },
                content = {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "Next")
                        Icon(
                            imageVector = Icons.AutoMirrored.Sharp.ArrowForwardIos,
                            contentDescription = "Go to Next Picture"
                        )
                    }
                },
                modifier = Modifier.width(140.dp)
            )
        }
    }
}