package com.example.greetingcard.woof

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.topicgrid.TopicData


@Preview(showBackground = true)
@Composable
fun WoofRender() {
    LazyColumn {
        items(TopicData.topics) {
            DogItem(dog = it)
        }
    }
}