package com.learning.calorytracker.navigation

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.learning.onboarding.presentation.welcome.WelcomeScreen

/**
 *  Each composable destination in your navigation graph is associated with a route.
 *  The NavHost acts as a container and is responsible for displaying the current destination of the graph.
 *  The NavController is the central component when using Navigation in Compose. It keeps track of back stack composable entries,
 *  moves the stack forward,enables back stack manipulation, and navigates between destination states
 *  The NavGraph maps out the composable destinations to navigate between.It is essentially a collection of fetchable destinations.
 *
 */

@Composable
fun CTNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = CTDestinations.Welcome.route,
) {
    NavHost(
        navController = navController, // hook navController up to navHost
        startDestination = startDestination, // which destination launched when app's launched
        modifier = modifier
    ) {// navGraph
        composable(CTDestinations.Welcome.route) {
            WelcomeScreen(onNextClick = {
                Log.e("Hello","Hello")
            })
        }
        composable(CTDestinations.Age.route) {

        }

    }
}

sealed class CTDestinations(
    val route: String,
) {
    object Welcome : CTDestinations("welcome_route")
    object Age : CTDestinations("age_route")

}

fun NavHostController.navigateTopTo(route: String) =
    this.navigate(route) //{ launchSingleTop = true }

