package com.example.dailyzen.ui.screens

import android.icu.text.CaseMap
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dailyzen.Page.DailyPages
import com.example.dailyzen.ui.components.Graph
import com.example.dailyzen.ui.components.JournalTile
import com.example.dailyzen.ui.components.TopBar
import com.example.dailyzen.ui.components.websiteVisits
import com.example.dailyzen.ui.components.websiteVisits2
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.DeepGreen
import com.example.dailyzen.ui.theme.LightGreen
import com.example.dailyzen.ui.theme.MediumGreen
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White

@Composable
fun Analytics(navController: NavController) {
    var choice by remember { mutableStateOf(0) }
    Column(
        Modifier
            .fillMaxSize()
            .background(Background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBar("Analytics")
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(modifier = Modifier.padding(start=20.dp,end=20.dp, bottom =20.dp)
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
                ).padding(start=20.dp,end=20.dp,top=10.dp,bottom =10.dp)
                .clickable { choice =0},
            ){
                Text("Today",style = MaterialTheme.typography.titleMedium,color= White)
            }
            Box(modifier = Modifier.padding(start=20.dp,end=20.dp, bottom =20.dp)
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
                ).padding(start=20.dp,end=20.dp,top=10.dp,bottom =10.dp)
                .clickable { choice =1},
            ){
                Text("Weekly",style = MaterialTheme.typography.titleMedium,color= White)
            }
            Box(modifier = Modifier.padding(start=20.dp,end=20.dp, bottom =20.dp)
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
                ).padding(start=20.dp,end=20.dp,top=10.dp,bottom =10.dp)
                .clickable { choice =2},
            ){
                Text("Monthly",style = MaterialTheme.typography.titleMedium,color= White)
            }

        }
        if(choice==0){
            DailyPages("08-11-2025", 8,"Sunday", navController=navController,logo=0)
        }
        if(choice==1){
            DailyPages("Weekly",8,"Sunday", navController=navController,logo=0)
        }
        if(choice==2){
            DailyPages("Monthly",8,"Sunday", navController=navController,logo=0)
        }
    }
    }
//
//@Preview(showBackground = true)
//@Composable
//fun AnalyticsScreenPreview() {
//    Analytics()
//}