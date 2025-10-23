package com.example.dailyzen.Components


import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.unit.dp
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.ui.theme.Green
import com.example.dailyzen.ui.theme.Lightgreen
import com.example.dailyzen.ui.theme.White
import kotlinx.coroutines.delay
import java.util.concurrent.TimeUnit


@Composable
fun Timer(

//    handleColor: Color,
//    inactiveBarColor: Color,
//    activeBarColor:Color,
//    initialValue:Float =0f
    ) {
    var totalTime by remember { mutableStateOf(1500000L) }
    var remainingTime by remember {
        mutableStateOf(totalTime)
    }
    var isRunning by remember {
        mutableStateOf(false)
    }
    var startTime by remember {
        mutableStateOf(0L)
    }

    val context = LocalContext.current
    val keyBoardController = LocalSoftwareKeyboardController.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Lightgreen).padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = formateTime(remainingTime),
            fontFamily = AgileFont,
            style = MaterialTheme.typography.headlineLarge,
            modifier = Modifier.padding(9.dp)
        )
        Spacer(modifier = Modifier.height(18.dp))

        Button(onClick = {
            if (isRunning) {
                isRunning = false
            } else {
                startTime = System.currentTimeMillis()
                isRunning = true
                keyBoardController?.hide()
            }
        }, colors = ButtonDefaults.buttonColors(
            containerColor = Green
        ),modifier = Modifier.height(50.dp).width(140.dp).padding(4.dp).clip(RoundedCornerShape(35.dp)).background(Green).border(
            shape = RoundedCornerShape(35.dp),
            width = 2.dp,
            color = White,)) {
            Text(text = if (isRunning) "Pause" else "Start", color = Color.White,fontFamily = AgileFont,)
        }
        Spacer(modifier = Modifier.height(18.dp))


        Row(Modifier.padding(4.dp)) {

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {
                totalTime = 1500000
                remainingTime = totalTime
                isRunning = false
            },colors = ButtonDefaults.buttonColors(
                containerColor = Green
            ),modifier = Modifier.weight(1f).padding(4.dp).clip(RoundedCornerShape(18.dp)).background(Green).border(
                shape = RoundedCornerShape(18.dp),
                width = 2.dp,
                color = White,)) {
                Text(text = "25", color = Color.White,fontFamily = AgileFont,)
            }
            Button(onClick = {
                totalTime = 2400000
                remainingTime = totalTime
                isRunning = false
            },colors = ButtonDefaults.buttonColors(
                containerColor = Green
            ), modifier = Modifier.weight(1f).padding(4.dp).clip(RoundedCornerShape(18.dp)).background(Green).border(
                shape = RoundedCornerShape(18.dp),
                width = 2.dp,
                color = White,)){
                Text(text = "40", color = Color.White,fontFamily = AgileFont,)
            }
            Button(onClick = {
                totalTime = 3300000
                remainingTime = totalTime
                isRunning = false
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Green
            ),modifier = Modifier.weight(1f).padding(4.dp).clip(RoundedCornerShape(18.dp)).background(Green).border(
                shape = RoundedCornerShape(18.dp),
                width = 2.dp,
                color = White,)) {
                Text(text = "55", color = Color.White,fontFamily = AgileFont,)
            }
            Button(onClick = {
                totalTime = 9990000
                remainingTime = totalTime
                isRunning = false
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Green
            ), modifier = Modifier.weight(1f).padding(4.dp).clip(RoundedCornerShape(18.dp)).background(Green).border(
                shape = RoundedCornerShape(18.dp),
                width = 2.dp,
                color = White,)) {
                Text(text = "+", color = Color.White,fontFamily = AgileFont,)
            }

        }

    }
    LaunchedEffect(isRunning) {
        if (isRunning) {
            startTime = System.currentTimeMillis() // start fresh
            while (isRunning && remainingTime > 0) {
                delay(1000)
                val elapsed = System.currentTimeMillis() - startTime
                remainingTime = (remainingTime - 1000).coerceAtLeast(0L)
            }
        }
}
}


fun formateTime(timeMi:Long): String {
    val hours = TimeUnit.MILLISECONDS.toHours(timeMi)
    val min = TimeUnit.MILLISECONDS.toMinutes(timeMi)%60
    val sec = TimeUnit.MILLISECONDS.toSeconds(timeMi)%60
    return String.format("%02d:%02d:%02d",hours,min,sec)

}