package com.example.greetingcard.topicgrid

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Grain
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.reusables.Picture
import kotlin.math.sin

@Preview(showBackground = true)
@Composable
fun SingleTopicCardPreview() {
    SingleTopicCard(TopicData.topics[2])
}

@Composable
fun SingleTopicCard(singleTopic: Topic) {
    Card {
        Row {
            val topicName = LocalContext.current.getString(singleTopic.name)
            Picture(id = singleTopic.imgId, contentDescription = "$topicName topic")
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = topicName,
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Sharp.Grain,
                        contentDescription = "Topic Decoration Icon"
                    )
                    Text(
                        text = singleTopic.associatedCourses.toString(),
                    )
                }
            }
        }
    }
}