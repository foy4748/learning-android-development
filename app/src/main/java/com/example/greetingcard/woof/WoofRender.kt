package com.example.greetingcard.woof

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.topicgrid.TopicData
import com.example.greetingcard.R


@Preview(showBackground = true)
@Composable
fun WoofRender() {
        Column {
            WoofTopBar(modifier = Modifier.fillMaxWidth())
            LazyColumn {
                items(TopicData.topics) {
                    DogItem(
                        dog = it,
                        modifier = Modifier
                            .padding(dimensionResource(R.dimen.padding_small))
                    )
                }
            }

        }

}