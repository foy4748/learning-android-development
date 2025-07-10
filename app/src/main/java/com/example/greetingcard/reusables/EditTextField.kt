package com.example.greetingcard.reusables

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun EditTextField(
    modifier: Modifier = Modifier,
    value: String = "",
    onValueChange: (String) -> Unit,
    label: String = "",
    singleLine: Boolean = true,
    keyboardOptions: KeyboardOptions,
    leadingIcon : ImageVector,
) {

    TextField(
        value = value,
        onValueChange = onValueChange,
        singleLine = singleLine,
        label = { Text(text=label) },
        keyboardOptions = keyboardOptions,
        modifier = modifier,
        leadingIcon = { Icon(leadingIcon, contentDescription = "null") }
    )
}
