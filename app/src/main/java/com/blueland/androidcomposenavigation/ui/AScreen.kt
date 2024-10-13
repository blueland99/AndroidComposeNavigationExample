package com.blueland.androidcomposenavigation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.blueland.androidcomposenavigation.navigation.Route

@Composable
fun AScreen(navController: NavHostController) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(text = "A Screen")

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    navController.navigate(
                        Route.BScreen.createRoute(
                            intParam = 42,
                            stringParam = "Hello, B!",
                            boolParam = true
                        )
                    )
                }
            ) {
                Text(text = "Go to B Screen with parameters")
            }
        }
    }
}
