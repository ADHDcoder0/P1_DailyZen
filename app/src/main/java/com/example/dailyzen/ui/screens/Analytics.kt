package com.example.dailyzen.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.ui.Components.Graph
import com.example.dailyzen.ui.Components.TopBar
import com.example.dailyzen.ui.Components.websiteVisits
import com.example.dailyzen.ui.Components.websiteVisits2
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White

@Composable
fun Analytics() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBar("Analytics")
        Box(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(20.dp))
                .background(Surface)
                .border(width = .5.dp, shape = RoundedCornerShape(20.dp), color = White)
                .padding(15.dp)
        ) {
            Graph(websiteVisits, websiteVisits2)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnalyticsScreenPreview() {
    Analytics()
}