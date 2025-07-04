package com.example.greetingcard.businesscard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.MailOutline
import androidx.compose.material.icons.sharp.Phone
import androidx.compose.material.icons.sharp.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BusinessOwnerContactInfo() {

    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(Icons.Sharp.Phone, contentDescription = null)
            Text(
                text = "+11 (123) 444 555 666",
                color = Color(0xEE333333),
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(Icons.Sharp.Share, contentDescription = null)
            Text(
                text = "@AndroidDev",
                color = Color(0xEE333333),
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            Icon(Icons.Sharp.MailOutline, contentDescription = null)
            Text(
                text = "jen.doe@android.com",
                color = Color(0xEE333333),
            )
        }
    }
}