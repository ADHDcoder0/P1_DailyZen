package com.example.dailyzen.Page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyzen.ui.Components.ProgressBar
import com.example.dailyzen.ui.Components.TopBar
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.ui.theme.Dark
import com.example.dailyzen.ui.theme.Green
import com.example.dailyzen.ui.theme.Lightgreen

@Composable
fun DailyPages(Date :Int,Day:String){

    Column(Modifier.fillMaxSize()) {
        TopBar("DailyZen")
        Column(Modifier.padding(4.dp)
            .background(Lightgreen, shape = RoundedCornerShape(20.dp))
            .padding(10.dp))
        {
            Row(Modifier.fillMaxWidth()) {
                Text(
                    "$Date October",
                    fontFamily = AgileFont,
                    fontSize = 22.sp
                    )
            }
            Text(
                "$Day ",
                fontFamily = AgileFont,
                fontSize = 14.sp,
                modifier = Modifier
            )
        }
        Row(Modifier.padding(4.dp)
            .background(Lightgreen, shape = RoundedCornerShape(20.dp))
            .padding(10.dp)){
            ProgressBar("Daily Task",.65f ,10)
            Text("\uD83D\uDE00",
                fontSize = 60.sp
            )
        }
    }
}

@Composable
fun Date(date:Int){}

@Preview(showBackground = true)
@Composable
fun Preview() {
    // TopBar()
    //Greeting("Kushagra")
    DailyPages(10,"Saturday")
}