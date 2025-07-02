package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme
import com.example.greetingcard.ui.theme.HappyBirthDayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Faisal",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }

            HappyBirthDayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(
                        color = MaterialTheme.colorScheme.background,
                        modifier = Modifier
//                            .background(color = Color.Red)
                            .padding(innerPadding),
                    ) {
                        BirthdayCardPreview()

                    }
                }

            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

//    Surface(color=Color.DarkGray, modifier = Modifier
//            .border(border= BorderStroke(width = 1.dp, color=Color.Red))
//            .fillMaxWidth()
//            .fillMaxHeight()
//            .wrapContentWidth(Alignment.CenterHorizontally)
//            .wrapContentHeight(Alignment.CenterVertically)
//        ) {
//
//    }
    Box(
        Modifier
//            .padding(10.dp)
//            .wrapContentSize(Alignment.Center)
            .border(border = BorderStroke(width = 1.dp, color = Color.White))
            .background(Color.DarkGray)
    ) {
        Text(
            text = "Hello $name!",
            modifier = modifier

        )

    }
}

//
@Composable
fun BirthdayGreeting(
    name: String,
    birthdayWish: String,
    modifier: Modifier = Modifier,
    textModifier: Modifier = Modifier
) {

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "Happy Birthday, $name",
            modifier = textModifier,
            fontSize = 36.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
        Text(
            text = birthdayWish,
            modifier = textModifier,
            fontSize = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Center
        )
    }

}

@Composable
fun BirthdayCardPicture(name: String, birthdayWish: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.9F,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        BirthdayGreeting(
            name,
            birthdayWish,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .wrapContentHeight(Alignment.CenterVertically)
//                .background(color = Color.Green)
//                .align(alignment = Alignment.CenterEnd)
                .padding(10.dp),
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardPicture("Faisal", "May all your wishes come true")
}