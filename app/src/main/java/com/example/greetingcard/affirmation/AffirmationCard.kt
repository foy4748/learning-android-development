package com.example.greetingcard.affirmation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.greetingcard.artgallery.GalleryPhoto
import com.example.greetingcard.reusables.Picture

@Composable
fun AffirmationCard(galleryPhoto : GalleryPhoto, modifier: Modifier= Modifier){

    Card(modifier) {
        Column {
            Picture(
                id = galleryPhoto.resourceId,
                contentDescription = galleryPhoto.description,
                modifier = Modifier.height(300.dp)
            )
            Text(
                text = galleryPhoto.description ?: "",
                modifier = Modifier.padding(12.dp)
            )
        }
    }
}