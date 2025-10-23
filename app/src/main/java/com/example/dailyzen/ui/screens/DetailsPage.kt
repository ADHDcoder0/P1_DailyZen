package com.example.dailyzen.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailyzen.ui.Components.TopBar
import com.example.dailyzen.ui.theme.Dark
import com.example.dailyzen.ui.theme.Lightgreen


@Composable
fun DetailsPage(title:String, percent :Float, Max:Int){
    Column(Modifier.fillMaxSize().background(Lightgreen)){
        TopBar(title)
        Text(percent.toString())
        Text(Max.toString())
    }
}


@Preview(showBackground=true )
@Composable
fun DetailsPagePreview(){
    DetailsPage("Work",0.7f,100)
}