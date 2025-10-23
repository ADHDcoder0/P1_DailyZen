package com.example.dailyzen.ui.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.ui.theme.Lightgreen
import com.example.dailyzen.ui.theme.White

@Composable
fun HabitBar(id:Int,title:String,percentage:Float,Max:Int,onClick: ()->Unit){
    Row(modifier=Modifier.padding(8.dp).border(width=2.dp,color=White,shape= RoundedCornerShape(20.dp))

        .background(Lightgreen,shape= RoundedCornerShape(20.dp))
        .fillMaxWidth()
        .clip(shape= RoundedCornerShape(20.dp))
        .padding(horizontal=16.dp,vertical = 2.dp)
        .clickable { onClick() },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){
        Text(title,
            textAlign = TextAlign.Center, fontFamily = AgileFont, color = Color.Black, fontSize = 30.sp)
        ProgressBar(title, percentage, Max)
    }

}

