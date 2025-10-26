package com.example.dailyzen.ui.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface

@Composable
fun MoodGrit(title: String = "Grit", navController: NavController) {

    Row(modifier = Modifier.padding(bottom = 8.dp,start=8.dp,end=8.dp)) {
        Column(
            modifier = Modifier
                .padding(end=4.dp)
                .background(
                    brush = Brush.verticalGradient(
                        listOf( OnPrimary, Color.DarkGray)
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(1.dp) // Border thickness
                // Inner background layer
                .background(
                    color = Surface,
                    shape = RoundedCornerShape(20.dp)
                )
                .height(160.dp).weight(2f),
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
                .padding(2.dp)
                .background(
                    brush = Brush.verticalGradient(
                        listOf( OnPrimary, Color.DarkGray)
                    ),
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(1.dp) // Border thickness
                // Inner background layer
                .background(
                    color = Surface,
                    shape = RoundedCornerShape(20.dp)
                )
                .height(160.dp).weight(2f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "I am Feeling",
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
@Composable
@Preview(showBackground = true)
fun PrevMoodGrit(){
    MoodGrit("Grit ", navController= rememberNavController())
}