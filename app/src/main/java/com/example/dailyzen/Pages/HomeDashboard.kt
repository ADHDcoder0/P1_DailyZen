package com.example.dailyzen.Pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.dailyzen.Components.DateScroll
import com.example.dailyzen.Components.Greeting
import com.example.dailyzen.Components.HabitBar
import com.example.dailyzen.Components.MoodGrit
import com.example.dailyzen.Components.TopBar
import com.example.dailyzen.ui.theme.ligherGreen

data class Habit(val title:String,val percent :Float,val Max:Int)
val habitList = listOf(
    Habit("Cycling", .4f, 67),
    Habit("Running", .5f, 21),
    Habit("DSA", .69f, 120),
    Habit("Kotlin", .12f, 33),
    Habit("Task", .4f, 67),
    Habit("Flask", .69f, 120),
    Habit("Murder", .02f, 50),
    Habit("Human", .9f, 365),
)
@Composable
fun DashBoard(){

    Column(modifier = Modifier.fillMaxSize().background(ligherGreen)) {


        LazyColumn(modifier= Modifier.weight(1f)) {
            item{TopBar()
                Greeting("Kushagra")
            }
            item{
                DateScroll()
            MoodGrit()}
            items(habitList){
                habit-> HabitBar(habit.title,habit.percent,habit.Max)
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