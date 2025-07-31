package com.example.greetingcard.router

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
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
import kotlinx.coroutines.launch

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


@ExperimentalMaterial3Api
@Preview(showBackground = true)
@Composable
fun MainLayout(navController: NavHostController = rememberNavController()) {
    val layoutDirection = LocalLayoutDirection.current
    AppTheme {
        val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
        val scope = rememberCoroutineScope()

        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentScreen = GreetingCardScreen.valueOf(
            backStackEntry?.destination?.route ?: GreetingCardScreen.Start.name
        )

        fun showOrHideMenu() {
            scope.launch {
                drawerState.apply {
                    if (isClosed) open() else close()
                }
            }
        }

        ModalNavigationDrawer(
            drawerState = drawerState,
            drawerContent = {
                ModalDrawerSheet {
                    Column(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Spacer(Modifier.height(12.dp))
                        Text(
                            "Greeting Card App",
                            modifier = Modifier.padding(16.dp),
                            style = MaterialTheme.typography.titleLarge
                        )
                        HorizontalDivider()

                        Text(
                            "Navigate to",
                            modifier = Modifier.padding(16.dp),
                            style = MaterialTheme.typography.titleMedium
                        )
                        for (item in GreetingCardScreen.entries) {
                            NavigationDrawerItem(
                                label = { Text(item.name) },
                                selected = false,
                                onClick = {
                                    navController.navigate(item.name)
                                    showOrHideMenu()
                                }
                            )

                        }

                        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

                        Spacer(Modifier.height(12.dp))
                    }
                }
            }
        ) {
            Scaffold(
                modifier = Modifier.fillMaxSize(),
                topBar = {
                    TopAppBar(
                        title = {
                            Text(
                                text = currentScreen.name
                            )
                        },
                        navigationIcon = {
                            Row {
                                if (navController.previousBackStackEntry != null) {
                                    IconButton(onClick = { navController.navigateUp() }) {
                                        Icon(
                                            imageVector = Icons.Filled.ArrowBackIosNew,
                                            contentDescription = "Navigate Back Button"
                                        )
                                    }
                                }
                                IconButton(onClick = {
                                    showOrHideMenu()
                                }) {
                                    Icon(
                                        imageVector = Icons.Filled.Menu,
                                        contentDescription = "Navigate Back Button"
                                    )
                                }
                            }
                        },
                    )
                },

                ) { innerPadding ->
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

}


/*

                floatingActionButton = {
                    ExtendedFloatingActionButton(
                        text = { Text("Show drawer") },
                        icon = {
                            Icon(
                                Icons.Sharp.Menu,
                                contentDescription = "Open / Close Drawer"
                            )
                        },
                        onClick = {
                            showOrHideMenu()
                        }
                    )
                },
 */