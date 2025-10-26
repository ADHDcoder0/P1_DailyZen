package com.example.dailyzen.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dailyzen.data.model.habitList
import com.example.dailyzen.ui.Components.DateScroll
import com.example.dailyzen.ui.Components.Greeting
import com.example.dailyzen.ui.Components.HabitBar
import com.example.dailyzen.ui.Components.MoodGrit
import com.example.dailyzen.ui.Components.TopBar
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.Green


@Composable
fun DashBoard(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().background(Background)) {
        LazyColumn(modifier= Modifier.weight(1f)) {
            item{TopBar("DailyZen",Green)
                Greeting("Kushagra")
            }
            item{
                DateScroll()
            MoodGrit(navController=navController)}
            items(habitList){
                habit-> HabitBar(id=habit.id,
                habit.title,
                habit.percent,
                habit.Max,onClick={
                navController.navigate(Screen.Details.passId(habit.id))
            },habit.dark,habit.medium,habit.light)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashBoard(navController = rememberNavController())
}