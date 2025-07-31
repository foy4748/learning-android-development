package com.example.greetingcard.router

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.greetingcard.BirthdayCardPreview
import com.example.greetingcard.affirmation.AffirmationRender
import com.example.greetingcard.artgallery.ArtGalleryRender
import com.example.greetingcard.article.ArticleTask
import com.example.greetingcard.birthdaycard.BirthdayCardRender
import com.example.greetingcard.businesscard.BusinessCardRender
import com.example.greetingcard.quadrant.Quadrant
import com.example.greetingcard.task.TaskCheckerTask
import com.example.greetingcard.tipcalculator.TipCalculatorRender
import com.example.greetingcard.topicgrid.TopicGridRender
import com.example.greetingcard.ui.theme.AppTheme
import com.example.greetingcard.unocard.UnoRandomCardRender
import com.example.greetingcard.woof.WoofRender

// Routes
enum class GreetingCardScreen() {
    Start,
    ArtGallery,
    Article,
    BirthdayCard,
    BusinessCard,
    Quadrant,
    Task,
    TipCalculator,
    TopicGrid,
    UnoCard,
    Woof
}


@Composable
fun MainLayout(navController: NavHostController = rememberNavController()) {
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
//                BirthdayCardPreview()
                NavHost(
                    navController = navController,
                    startDestination = GreetingCardScreen.Start.name
                ) {
                    composable(GreetingCardScreen.Start.name) {
                        AffirmationRender()
                    }

                    composable(GreetingCardScreen.ArtGallery.name) {
                        ArtGalleryRender()
                    }
                    composable(GreetingCardScreen.Article.name) {
                        ArticleTask()
                    }
                    composable(GreetingCardScreen.BirthdayCard.name) {
                        BirthdayCardRender(
                            name = "Faisal",
                            birthdayWish = "May all your wishes come true"
                        )
                    }
                    composable(GreetingCardScreen.BusinessCard.name) {
                        BusinessCardRender()
                    }
                    composable(GreetingCardScreen.Quadrant.name) {
                        Quadrant()
                    }
                    composable(GreetingCardScreen.Task.name) {
                        TaskCheckerTask()
                    }
                    composable(GreetingCardScreen.TipCalculator.name) {
                        TipCalculatorRender()
                    }
                    composable(GreetingCardScreen.TopicGrid.name) {
                        TopicGridRender()
                    }
                    composable(GreetingCardScreen.UnoCard.name) {
                        UnoRandomCardRender()
                    }
                    composable(GreetingCardScreen.Woof.name) {
                        WoofRender()
                    }
                }
            }
        }

    }

}
