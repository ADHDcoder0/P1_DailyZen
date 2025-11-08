package com.example.dailyzen.Page

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dailyzen.ui.components.ProgressBar
import com.example.dailyzen.ui.components.TopBar
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.data.model.DailyList
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.components.DailyTrackerBar
import com.example.dailyzen.ui.components.Journal
import com.example.dailyzen.ui.components.MoodGrit

import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.Dark
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White
import com.example.dailyzen.ui.theme.ligherGreen

val background = ligherGreen

@Composable
fun DailyPages(Title: String, Date: Int, Day: String, navController: NavController, logo: Int) {

    LazyColumn(
        Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        item {
            Column(
                Modifier
                    .padding(6.dp)

                    .padding(10.dp)
            )
            {
                Row(
                    Modifier.fillMaxWidth()
                ) {
                    Text(
                        "$Date October",
                        color = OnPrimary,
                        fontFamily = AgileFont,
                        fontSize = 22.sp
                    )
                }
                Text(
                    "$Day ",
                    fontFamily = AgileFont,
                    color = OnPrimary,
                    fontSize = 14.sp,
                    modifier = Modifier
                )
            }
        }

        item {
            Row(
                modifier = Modifier.padding(bottom = 6.dp, start = 6.dp, end = 6.dp)
            )
            {
                Column(
                    modifier = Modifier
                        .padding(end = 6.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(
                            brush = Brush.verticalGradient(
                                listOf(OnPrimary, Color.DarkGray)
                            ),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(1.dp) // Border thickness
                        // Inner background layer
                        .background(
                            color = Surface,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .height(160.dp)
                        .weight(2f),
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

                        .background(
                            brush = Brush.verticalGradient(
                                listOf(OnPrimary, Color.DarkGray)
                            ),
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(1.dp) // Border thickness
                        // Inner background layer
                        .background(
                            color = Surface,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .height(160.dp)
                        .weight(2f),
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
        item {
            Row(
                modifier = Modifier.clickable { navController.navigate(Screen.Journal.route) }

                    .padding(end = 6.dp, bottom = 6.dp, start = 6.dp, top = 6.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .background(
                        brush = Brush.linearGradient(
                            listOf(OnPrimary, Background)
                        ),
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(1.dp) // Border thickness
                    // Inner background layer
                    .background(
                        color = Surface,
                        shape = RoundedCornerShape(20.dp)
                    )
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Your Journal",
                    textAlign = TextAlign.Center,
                    color = OnPrimary,
                    fontFamily = AgileFont,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .padding(6.dp)
                             )
                Row(modifier = Modifier.padding(2.dp)) {
                    Button(
                        onClick = {
                            Toast.makeText(
                                navController.context,
                                "Journal",
                                Toast.LENGTH_SHORT
                            ).show()
                        },
                        modifier = Modifier.padding(end = 3.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 2.dp),
                        colors = ButtonDefaults.buttonColors(Dark),
                        elevation = ButtonDefaults.buttonElevation(2.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = "See the List",
                            tint = OnPrimary
                        )
                    }
                    Button(
                        onClick = {}, modifier = Modifier.padding(end = 3.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 2.dp),
                        colors = ButtonDefaults.buttonColors(Dark),
                        elevation = ButtonDefaults.buttonElevation(2.dp),
                        shape = RoundedCornerShape(50.dp)
                    ) {

                        Icon(
                            imageVector = Icons.Default.List,
                            contentDescription = "See the List",
                            tint = OnPrimary
                        )

                    }
                    Button(
                        onClick = {}, modifier = Modifier.padding(end = 3.dp),
                        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 2.dp),
                        colors = ButtonDefaults.buttonColors(Dark),
                        elevation = ButtonDefaults.buttonElevation(2.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Filled.LocalFireDepartment,
                            contentDescription = "Your Streak", tint = OnPrimary
                        )
                        Text(
                            text = "99",
                            fontFamily = AgileFont,
                            style = MaterialTheme.typography.titleSmall,
                            color = OnPrimary
                        )
                    }
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
                }, daily.logo, daily.dark, daily.medium, daily.light
            )
        }
    }


}




