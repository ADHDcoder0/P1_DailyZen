package com.example.dailyzen.data.model

public data class Habit(val id:Int,val title:String,val percent :Float,val Max:Int)
val habitList = listOf(
    Habit(1,"Cycling", .4f, 67),
    Habit(2,"Running", .5f, 21),
    Habit(3,"DSA", .69f, 120),
    Habit(4, "Kotlin", .12f, 33),
    Habit(5,"Task", .4f, 67),
    Habit(6,"Flask", .69f, 120),
    Habit(7,"Murder", .02f, 50),
    Habit(8,"Human", .9f, 365),
)