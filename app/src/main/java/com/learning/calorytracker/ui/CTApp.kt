package com.learning.calorytracker.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.learning.calorytracker.navigation.CTNavHost

@Composable
fun CTApp(
    ctAppState: CTAppState = rememberCalorieTrackerAppState()
) {
    Scaffold { padding ->
        CTNavHost(
            navController = ctAppState.navController,
            modifier = Modifier.padding(padding)
        )

    }

}