package com.example.greetingcard.tipcalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.reusables.EditTextField

// import java.text.NumberFormat

private fun calculateTip(amount: Double, tipPercent: Double = 15.0): String {
    val tip = tipPercent / 100 * amount
//    return NumberFormat.getCurrencyInstance().format(tip)
    return tip.toString()
}


@Preview(showBackground = true)
@Composable
fun TipCalculatorRender() {
    var givenInput by remember { mutableStateOf("") }
    var tipPercent by remember { mutableStateOf("15") }
    val tipAmount =
        calculateTip(givenInput.toDoubleOrNull() ?: 0.0, tipPercent.toDoubleOrNull() ?: 0.0)
    val totalAmount = ((tipAmount.toDoubleOrNull() ?: 0.0) + (givenInput.toDoubleOrNull() ?: 0.0))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "Calculate Tip",
            fontSize = 18.sp,
            modifier = Modifier.align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(20.dp))

//        TextField(
//            value = givenInput,
//            onValueChange = { givenInput = it },
//            label = { Text(text = "Bill Amount") },
//            singleLine = true,
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
//            modifier = Modifier
//                .fillMaxWidth()
//        )
        EditTextField(
            value = givenInput,
            onValueChange = { givenInput = it },
            label = "Bill Amount",
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))
        EditTextField(
            value = tipPercent,
            onValueChange = { tipPercent = it },
            label = "Tip Percent %",
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Tip Amount: $$tipAmount", fontWeight = FontWeight.Bold, fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Total Payable: $$totalAmount",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}