package com.example.greetingcard

import com.example.greetingcard.birthdaycard.BirthdayCardPicture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.article.ArticlePicture
import com.example.greetingcard.article.ArticleText
import com.example.greetingcard.quadrant.SingleTextUnit
import com.example.greetingcard.task.TaskPicture
import com.example.greetingcard.task.TaskText
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
                        name = "Faisal", modifier = Modifier.padding(innerPadding)
                    )
                }
            }

            HappyBirthDayTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(
                        color = MaterialTheme.colorScheme.background,
                        modifier = Modifier
                            .background(color = Color.Red)
                            .padding(innerPadding)
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
            text = "Hello $name!", modifier = modifier

        )

    }
}

//


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
//    BirthdayCardPicture("Faisal", "May all your wishes come true")
//    TaskCheckerTask()
//    ArticleTask()
    // Quadrant
    Quadrant()
}

@Composable
fun Quadrant() {

    val weight = 1f

    // Layout
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .weight(weight)
        ) {
            SingleTextUnit(
                title = "Text composable",
                text = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFEADDFF))
            )
            SingleTextUnit(
                title = "Image composable",
                text = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFD0BCFF))
            )

        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .weight(weight)
        ) {
            SingleTextUnit(
                title = "Row composable",
                text = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFB69DF8))
            )
            SingleTextUnit(
                title = "Column composable",
                text = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .fillMaxSize()
                    .weight(weight)
                    .background(Color(0xFFF6EDFF))
            )

        }
    }
}

@Composable
fun ArticleTask() {

    Column(modifier = Modifier.fillMaxSize()) {

        ArticlePicture(modifier = Modifier.fillMaxWidth())
        ArticleText(modifier = Modifier.padding(24.dp))
    }

}

@Composable
fun TaskCheckerTask() {

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        TaskPicture(modifier = Modifier.fillMaxWidth())
        TaskText()
    }
}