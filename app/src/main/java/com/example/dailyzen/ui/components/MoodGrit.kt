package com.example.dailyzen.ui.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.theme.Dark
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface

@Composable
fun MoodGrit(title: String = "Grit", navController: NavController) {

    Row(modifier = Modifier.padding(bottom = 6.dp, start = 6.dp, end = 6.dp)) {
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
                .height(166.dp).weight(2f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "Grit",
                style = MaterialTheme.typography.titleLarge,
                color = OnPrimary,
                modifier = Modifier
                    .clickable { navController.navigate(Screen.Analytics.route) }
                    .padding(10.dp),
                textAlign = TextAlign.Center,
            )

            ProgressBar("Daily Task", 0.8f, 160)
        }
        Column(
            modifier = Modifier
                .height(166.dp).weight(2f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row( modifier = Modifier.fillMaxWidth()
                .clickable { navController.navigate(Screen.Analytics.route) }
                .padding(start=6.dp,end=6.dp) .background(
                    brush = Brush.verticalGradient(
                        listOf(OnPrimary, Color.DarkGray)
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(1.dp) // Border thickness
                // Inner background layer
                .background(
                    color = Surface,
                    shape = RoundedCornerShape(20.dp),

                ).weight(1f), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "Mood",
                    style = MaterialTheme.typography.titleLarge,
                    color = OnPrimary,
                    modifier = Modifier
                        .clickable { navController.navigate(Screen.Analytics.route) }
                        .padding(start=4.dp) ,
                    textAlign = TextAlign.Center,
                )
                Text(
                    "\uD83D\uDE00",
                    fontSize = 45.sp,
                    color = OnPrimary,
                    modifier = Modifier
                        .clickable { navController.navigate(Screen.Analytics.route) }
                        .padding(end=4.dp),
                    textAlign = TextAlign.Center,
                )

            }
            Row(modifier = Modifier.fillMaxWidth()
                .clickable { navController.navigate(Screen.Analytics.route) }
                .padding(start=6.dp,end=6.dp,top=6.dp) .background(
                    brush = Brush.verticalGradient(
                        listOf(OnPrimary, Color.DarkGray)
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(1.dp) // Border thickness
                // Inner background layer
                .background(
                    color = Surface,
                    shape = RoundedCornerShape(20.dp),

                    ).weight(1f), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Your Journal",
                    textAlign = TextAlign.Center,
                    color = OnPrimary,
                    fontFamily = AgileFont,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .padding(6.dp)
                        .clickable { navController.navigate(Screen.Journal.route) }
                )
                Row(modifier = Modifier.padding(5.dp)) {
                    Icon(
                        imageVector = Icons.Filled.LocalFireDepartment,
                        contentDescription = "Your Streak", tint = OnPrimary
                    )
                    Text(
                        text = "99",
                        fontFamily = AgileFont,
                        style = MaterialTheme.typography.titleMedium,
                        color = OnPrimary
                    )
                }

            }
        }
    }
}
@Composable
@Preview(showBackground = true)
fun PrevMoodGrit(){
    MoodGrit("Grit ", navController= rememberNavController())
}