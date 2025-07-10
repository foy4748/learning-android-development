package com.example.greetingcard.tipcalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.reusables.EditTextField
import kotlin.math.ceil

// import java.text.NumberFormat

private fun calculateTip(
    amount: Double,
    tipPercent: Double = 15.0,
    isRoundedUp: Boolean = false
): String {
    var tip = tipPercent / 100 * amount
//    return NumberFormat.getCurrencyInstance().format(tip)
    if (isRoundedUp) tip = ceil(tip)
    return "%.2f".format(tip)
}


@Preview(showBackground = true)
@Composable
fun TipCalculatorRender() {
    var givenInput by remember { mutableStateOf("") }
    var tipPercent by remember { mutableStateOf("") }
    var isRoundUp by remember { mutableStateOf(false) }

    val tipAmount =
        calculateTip(
            givenInput.toDoubleOrNull() ?: 0.0,
            tipPercent.toDoubleOrNull() ?: 0.0,
            isRoundedUp = isRoundUp
        )
    val totalAmount = ((tipAmount.toDoubleOrNull() ?: 0.0) + (givenInput.toDoubleOrNull() ?: 0.0))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {
        // Page Title
        Text(
            text = "Calculate Tip",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(20.dp))

        // Input Fields

        // // Bill Amount Field
        EditTextField(
            value = givenInput,
            onValueChange = { givenInput = it },
            label = "Bill Amount",
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        // // Tip Percentage Field
        EditTextField(
            value = tipPercent,
            onValueChange = { tipPercent = it },
            label = "Tip Percent %",
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        // // Should Tip Round Up selector
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Round Up the tip ?")
            Switch(checked = isRoundUp, onCheckedChange = { isRoundUp = !isRoundUp })

        }

        // END of Input Fields -------------------

        Spacer(modifier = Modifier.height(20.dp))

        // Outputs to Show User

        // // Tip Amount Output
        Text(text = "Tip Amount: $$tipAmount", fontWeight = FontWeight.Bold, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(20.dp))

        // // Total Bill Output
        Text(
            text = "Total Payable: $$totalAmount",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}