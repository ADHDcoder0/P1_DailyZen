package com.example.dailyzen.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.ui.theme.Dark
import com.example.dailyzen.ui.theme.Green
import com.example.dailyzen.ui.theme.ligherGreen

@Composable
fun Analytics (){

    Box(Modifier.fillMaxSize().background(color= Green),
        contentAlignment = Alignment.Center) {
        Text(
            "Hello World",
            fontSize = 72.sp,
            fontFamily = AgileFont,
            color = Dark,
            modifier = Modifier.background(color= ligherGreen,shape= RoundedCornerShape(20)).padding(10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview(){
    Analytics()
}