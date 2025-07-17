package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.affirmation.AffirmationRender
import com.example.greetingcard.ui.theme.AppTheme
import com.example.greetingcard.unocard.UnoRandomCardRender

//import com.example.greetingcard.ui.theme.GreetingCardTheme
//import com.example.greetingcard.ui.theme.HappyBirthDayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            GreetingCardTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Faisal", modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }

//            val layoutDirection = LocalLayoutDirection.current
//            HappyBirthDayTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Surface(
//                        color = MaterialTheme.colorScheme.background,
//                        modifier = Modifier
//                            .background(color = Color.Red)
//                            .padding(innerPadding)
//                            .padding(
//                                start = WindowInsets.safeDrawing.asPaddingValues()
//                                    .calculateStartPadding(layoutDirection),
//                                end = WindowInsets.safeDrawing.asPaddingValues()
//                                    .calculateEndPadding(layoutDirection),
//                            ),
//                    ) {
//                        BirthdayCardPreview()
//                    }
//                }
//
//            }

            val layoutDirection = LocalLayoutDirection.current
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Surface(
                        color = MaterialTheme.colorScheme.background,
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(
                                start = WindowInsets.safeDrawing.asPaddingValues()
                                    .calculateStartPadding(layoutDirection),
                                end = WindowInsets.safeDrawing.asPaddingValues()
                                    .calculateEndPadding(layoutDirection),
                            ),
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
//    BirthdayCardRender("Faisal", "Wish You all the best")
//    TaskCheckerTask()
//    ArticleTask()
//    Quadrant()
//    BusinessCardRender()
//    Button(onClick = {}) {
//        Text(text="Get Started")
//    }
//    AffirmationRender()
//    ArtGalleryRender()
    UnoRandomCardRender()
}


