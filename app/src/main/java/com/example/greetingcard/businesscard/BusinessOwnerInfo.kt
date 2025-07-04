package com.example.greetingcard.businesscard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BusinessOwnerInfo(ownerName:String,ownerDesignation:String,modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.spacedBy(18.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        // Title
        Text(
            text = ownerName,
            fontSize = 36.sp,
            color = Color(0xEE333333),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        // Paragraph 1
        Text(
            text = ownerDesignation,
            fontSize = 24.sp,
            color = Color(0xEE333333),
            textAlign = TextAlign.Center
        )
    }
}