package com.example.dailyzen.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailyzen.ui.components.Timer

import com.example.dailyzen.ui.components.TopBar

@Composable
fun Pomodoro(){
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar("Pomodoro")
        Timer()

    }
}

@Preview(showBackground = true)
@Composable
fun PomodoroScreenPreview(){
    Pomodoro()
}