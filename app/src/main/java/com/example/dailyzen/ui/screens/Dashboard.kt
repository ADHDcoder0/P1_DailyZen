package com.example.dailyzen.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.dailyzen.data.model.habitList
import com.example.dailyzen.ui.Components.DateScroll
import com.example.dailyzen.ui.Components.Greeting
import com.example.dailyzen.ui.Components.HabitBar
import com.example.dailyzen.ui.Components.MoodGrit
import com.example.dailyzen.ui.Components.TopBar
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.Components.BottomBar
import com.example.dailyzen.ui.theme.ligherGreen


@Composable
fun DashBoard(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().background(ligherGreen)) {
        LazyColumn(modifier= Modifier.weight(1f)) {
            item{TopBar("DailyZen")
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
            })
            }
        }
        //HabitTile()
        //Column(modifier= Modifier.verticalScroll(rememberScrollState())) {
//            HabitBar("Cycling", .4f, 67)
//            HabitBar("Running", .5f, 21)
//            HabitBar("DSA", .69f, 120)
//            HabitBar("Kotlin", .12f, 33)
//            HabitBar("Task", .4f, 67)
//            HabitBar("Flask", .69f, 120)
//            HabitBar("Murder", .02f, 50)
//            HabitBar("Human", .9f, 365)
//        }

    }
}