package com.example.dailyzen.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Details
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LooksTwo
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.Today
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

sealed class Screen(val route :String,val title:String="Not Applicable",val icon: ImageVector) {
    object Home : Screen("home",
        "home", Icons.Default.Home)
    object Analytics :Screen ("analytics",
       "Analytics", Icons.Default.Analytics)
    object Daily : Screen("Daily","Daily",Icons.Default.Today)

    object Settings : Screen("Setting","Setting",Icons.Default.Settings)
    object Pomodoro: Screen("pomodoro","Pomodoro",Icons.Default.Timer)
    object Details : Screen("Details/{habitId}","Details",Icons.Default.Details){
        fun passId(habitId:Int):String{
            return "Details/$habitId"
        }

    }
}