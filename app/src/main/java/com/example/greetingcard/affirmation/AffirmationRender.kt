package com.example.greetingcard.affirmation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.artgallery.GalleryData

@Preview(showBackground = true)
@Composable
fun AffirmationRender() {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        items(GalleryData) { singleData ->
            AffirmationCard(
                singleData,
                modifier = Modifier.padding(14.dp)
            )
        }
    }
}