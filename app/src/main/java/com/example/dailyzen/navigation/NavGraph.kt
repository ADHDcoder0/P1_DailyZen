package com.example.dailyzen.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.dailyzen.Page.DailyPages
import com.example.dailyzen.data.model.habitList
import com.example.dailyzen.ui.Components.Settings
import com.example.dailyzen.ui.screens.Analytics
import com.example.dailyzen.ui.screens.DashBoard
import com.example.dailyzen.ui.screens.DetailsPage
import com.example.dailyzen.ui.screens.Pomodoro


@Composable
fun SetupNavGraph(
    navController : NavHostController
){
    NavHost(
        navController= navController,
        startDestination= Screen.Home.route
    ){
        composable(
            route= Screen.Home.route
        ){
            DashBoard(navController)
        }
        composable(
            route= Screen.Analytics.route
        ){
            Analytics()
        }
        composable(
                route = Screen.Daily.route
        ){
            DailyPages(22,"Sun")
        }
        composable (Screen.Settings.route){
            Settings()
        }
        composable (Screen.Pomodoro.route){
            Pomodoro()
        }
        composable(route = Screen.Details.route,
            arguments = listOf(navArgument("habitId"){ type= NavType.IntType })
       )
        {backStackEntry->
            val habitId = backStackEntry.arguments?.getInt("habitId")
            val habit = habitList.find { it.id == habitId }

        if (habit != null) {
            DetailsPage(title = habit.title, percent = habit.percent, Max = habit.Max)
        }


    }
    }
}
