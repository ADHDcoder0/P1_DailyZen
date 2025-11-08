package com.example.dailyzen.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LooksTwo
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.Today
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

sealed class Screen(
    val route: String,
    val title: String = "Not Applicable",
    val icon: ImageVector
) {
    object Home : Screen(
        "home",
        "Home", Icons.Filled.Home
    )

    object Analytics : Screen(
        "analytics",
        "Analytics", Icons.Default.Analytics
    )

    object Daily : Screen("Daily", "Daily", Icons.Filled.Today)

    object Settings : Screen("Setting", "Settings", Icons.Filled.Settings)
    object Pomodoro : Screen("pomodoro", "Pomodoro", Icons.Filled.Timer)
    object Details : Screen("Details/{habitId}", "Details", Icons.Filled.Details) {
        fun passId(habitId: Int): String {
            return "Details/$habitId"
        }

    }
    object Journal :Screen("Journal", "Journal", Icons.Filled.Book)
    object JournalDaily : Screen("journal/{journalId}", "journal", Icons.Filled.Book) {
        fun passId(journalId: Int): String {
            return "journal/$journalId"
        }
    }
    object DetailsH : Screen("DetailsH/{dailyId}", "DetailsH", Icons.Filled.Details) {
        fun passId(dailyId: Int): String {
            return "DetailsH/$dailyId"
        }
    }
}