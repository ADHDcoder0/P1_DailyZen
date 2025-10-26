package com.example.dailyzen.data.model

import androidx.compose.ui.graphics.Color

import com.example.dailyzen.ui.theme.*

public data class Habit(val id:Int, val title:String, val percent :Float, val Max:Int, val dark: Color, val medium:Color, val light:Color)
//val habitList = listOf(
//    Habit(1,"Cycling", .4f, 67),
//    Habit(2,"Running", .5f, 21),
//    Habit(3,"DSA", .69f, 120),
//    Habit(4, "Kotlin", .12f, 33),
//    Habit(5,"Task", .4f, 67),
//    Habit(6,"Flask", .69f, 120),
//    Habit(7,"Murder", .02f, 50),
//    Habit(8,"Human", .9f, 365),
//)id: Int, title: String, percentage: Float, Max: Int, onClick: () -> Unit,dark: Color,medium:Color,light:Color
val habitList = listOf(
    Habit(1, "Cycling", 0.4f, 67, DeepGreen , MediumGreen, LightGreen),
    Habit(2, "Running", 0.5f, 21, DeepBlue , MediumBlue, LightBlue),
    Habit(3, "DSA", 0.69f, 120, DeepAmber , MediumAmber, LightAmber),
    Habit(4, "Kotlin", 0.12f, 33, DeepViolet , MediumViolet, LightViolet),
    Habit(5, "Task", 0.4f, 67, DeepCoral, MediumCoral, LightCoral),
    Habit(6, "Flask", 0.69f, 120, DeepCyan, MediumCyan, LightCyan),
    Habit(7, "Murder", 0.02f, 50, DeepSlate, MediumSlate, LightSlate),
    Habit(8, "Human", 0.9f, 365, DeepAmber, MediumAmber, LightAmber)
)