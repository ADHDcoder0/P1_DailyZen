package com.example.dailyzen.Page

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dailyzen.ui.Components.ProgressBar
import com.example.dailyzen.ui.Components.TopBar
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.data.model.DailyList
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.Components.DailyTrackerBar
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White
import com.example.dailyzen.ui.theme.ligherGreen

val background = ligherGreen

@Composable
fun DailyPages(Date: Int, Day: String, navController: NavController,logo: Int) {

    LazyColumn(Modifier
        .fillMaxSize()
        .background(Background)) {
        item { TopBar("DailyZen") }
        item {
            Column(
                Modifier
                    .padding(8.dp)
                    .border(color = White, width = .5.dp, shape = RoundedCornerShape(20.dp))
                    .background(Surface, shape = RoundedCornerShape(20.dp))
                    .padding(10.dp)
            )
            {
                Row(Modifier.fillMaxWidth()) {
                    Text(
                        "$Date October",
                        color= OnPrimary,
                        fontFamily = AgileFont,
                        fontSize = 22.sp
                    )
                }
                Text(
                    "$Day ",
                    fontFamily = AgileFont,
                    color= OnPrimary,
                    fontSize = 14.sp,
                    modifier = Modifier
                )
            }
        }

        item {
            Row(modifier = Modifier.padding(6.dp)) {
                Column(
                    modifier = Modifier
                        .padding(2.dp)
                        .background(Surface, shape = RoundedCornerShape(20.dp))
                        .border(
                            width = .5.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .height(160.dp).weight(2f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        "Task",
                        style = MaterialTheme.typography.titleLarge,
                        color = OnPrimary,
                        modifier = Modifier
                            .clickable { navController.navigate(Screen.Analytics.route) }
                            .padding(10.dp),
                        textAlign = TextAlign.Center,
                    )

                    ProgressBar("Daily Task", 0.8f, 10)
                }
                Column(
                    modifier = Modifier
                        .padding(2.dp)
                        .background(Surface, shape = RoundedCornerShape(20.dp))
                        .border(
                            width = .5.dp,
                            color = Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .height(160.dp).weight(2f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "Mood",
                        style = MaterialTheme.typography.titleLarge,
                        color = OnPrimary,
                        modifier = Modifier
                            .clickable { navController.navigate(Screen.Analytics.route) }
                            .padding(10.dp),
                        textAlign = TextAlign.Center,
                    )
                    Text(
                        "\uD83D\uDE00",
                        fontSize = 60.sp,
                        color = OnPrimary,
                        modifier = Modifier
                            .clickable { navController.navigate(Screen.Analytics.route) }
                            .padding(10.dp),
                        textAlign = TextAlign.Center,
                    )

                }
            }
        }


        items(DailyList) { daily ->
            DailyTrackerBar(
                id = daily.id,
                daily.title,
                daily.percent,
                daily.Max, onClick = {
                    navController.navigate(Screen.DetailsH.passId(daily.id))
                },daily.logo,daily.dark,daily.medium,daily.light)
        }
    }


}


@Composable
fun Date(date: Int) {
}


