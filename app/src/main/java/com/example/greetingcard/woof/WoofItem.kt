package com.example.greetingcard.woof

import androidx.compose.animation.expandIn
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.greetingcard.R
import com.example.greetingcard.topicgrid.Topic

/**
 * Composable that displays a list item containing a dog icon and their information.
 *
 * @param dog contains the data that populates the list item
 * @param modifier modifiers to set to this composable
 */
@Composable
fun DogItem(
    dog: Topic,
    modifier: Modifier = Modifier
) {
    var isOpen by remember { mutableStateOf(false) }
    Card(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            DogIcon(dog.imgId)
            DogInformation(dog.name, dog.associatedCourses)
            Spacer(modifier = Modifier.weight(1F))
            WoofExpandCollapseButton(onClick = { isOpen = !isOpen}, expanded = isOpen)
        }
        if (isOpen)
            Text(
                text = "${stringResource(dog.name)} is a Good Dog",
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = dimensionResource(R.dimen.padding_small))
            )

    }
}
