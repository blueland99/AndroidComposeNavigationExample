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
import com.blueland.androidcomposenavigation.model.UserModel
import com.blueland.androidcomposenavigation.navigation.Route

@Composable
fun CScreen(
    navController: NavHostController,
    userModel: UserModel?
) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(text = "C Screen")

            // 전달받은 값들 표시
            userModel?.let {
                Text(text = "nickname: ${it.nickname}")
                Text(text = "phoneNumber: ${it.phoneNumber}")
            }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    // A 화면으로 돌아가고 모든 백스택을 제거
                    navController.navigate(Route.AScreen.route) {
                        popUpTo(Route.AScreen.route) { inclusive = true }
                    }
                }
            ) {
                Text(text = "Go to A Screen and clear all")
            }

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = { navController.navigateUp() }
            ) {
                Text(text = "Go Back")
            }
        }
    }
}
