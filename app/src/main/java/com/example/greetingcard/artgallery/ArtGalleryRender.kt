package com.example.greetingcard.artgallery

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
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
        modifier = Modifier.fillMaxHeight()
    ) {
        Box {
            Picture(id = data[currentIndex].resourceId)
            Column(
                verticalArrangement = Arrangement.Bottom, modifier = Modifier
                    .wrapContentHeight()
                    .wrapContentWidth()
            ) {

                Text(text = data[currentIndex].licenseType, color = Color(0xFFFFFFFF))
            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
        ) {
            Button(
                onClick = {
                    currentIndex--
                    if (currentIndex < 0) currentIndex = data.size - 1
                },
                content = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Sharp.ArrowBackIos,
                        contentDescription = "Go Previous"
                    )
                }
            )
            Button(
                onClick = {
                    currentIndex++
                    currentIndex = currentIndex % data.size
                },
                content = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Sharp.ArrowForwardIos,
                        contentDescription = "Go Forward"
                    )
                }
            )
        }
    }
}