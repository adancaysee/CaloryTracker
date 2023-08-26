package com.learning.calorytracker.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController



@Composable
fun rememberCalorieTrackerAppState(
    navController: NavHostController = rememberNavController()
):CTAppState {
    return CTAppState(
        navController
    )
}

data class CTAppState(
    val navController: NavHostController
)