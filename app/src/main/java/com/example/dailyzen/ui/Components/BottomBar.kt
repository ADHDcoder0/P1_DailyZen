package com.example.dailyzen.ui.Components

import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.theme.*
import com.example.dailyzen.ui.theme.White


@Composable
fun BottomBar(navController: NavController) {
    val items = listOf(
        Screen.Home,
        Screen.Analytics,
        Screen.Daily,
        Screen.Pomodoro,
        Screen.Settings

    )

    NavigationBar(
        modifier = Modifier.background(
            brush = Brush.run {
                verticalGradient(
                    colors = listOf(

                        Surface, Background,
                    )
                )
            }
        ),
        containerColor = Color.Transparent,
        contentColor = Color.White,
        tonalElevation = 20.dp
    ) {
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route
        items.forEach { screen ->
            NavigationBarItem(
                icon = { Icon(screen.icon, contentDescription = screen.title, tint = White) },
                label = { Text(screen.title, color = White, style = MaterialTheme.typography.labelSmall) },
                selected = currentRoute == screen.route,
                onClick = {
                    if (currentRoute != screen.route) {
                        navController.navigate(screen.route) {
                            popUpTo(Screen.Home.route)
                            launchSingleTop = true
                        }
                    }
                }
            )
        }
    }

}
