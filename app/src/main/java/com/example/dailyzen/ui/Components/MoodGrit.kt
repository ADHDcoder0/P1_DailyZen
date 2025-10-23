package com.example.dailyzen.ui.Components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.data.model.AgileFont

@Composable
fun MoodGrit(title:String="Grit",navController: NavController){
    Row( modifier = Modifier
        .fillMaxWidth()
        .padding(6.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier.weight(1f).aspectRatio(1.25f)
            .border(width=2.dp,color=Color.White,shape= RoundedCornerShape(20.dp))
            .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text("I am Feeling",
                fontFamily = AgileFont
            )
            Text("\uD83D\uDE00",
                modifier = Modifier.clickable{navController.navigate(Screen.Daily.route)},
                fontSize = 60.sp
            )
        }
        Column(modifier = Modifier
            .border(width=2.dp,color=Color.White,shape= RoundedCornerShape(20.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){
            Text(title,
                fontFamily = AgileFont,
                modifier = Modifier.clickable{navController.navigate(Screen.Analytics.route)}.padding(10.dp),
                textAlign = TextAlign.Center,
                fontSize = 22.sp
            )
            ProgressBar(title, 0.8f, 160)
        }


    }
}