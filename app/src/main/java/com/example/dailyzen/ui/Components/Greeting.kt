package com.example.dailyzen.ui.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.ui.theme.Lightgreen
import com.example.dailyzen.ui.theme.White

@Composable
fun Greeting(nam:String){
    val name = nam
    Row(
        modifier = Modifier.Companion
            .fillMaxWidth()
            .padding(5.dp)
            .background(Lightgreen, shape = RoundedCornerShape(20.dp))
            .border(
                width = 2.dp,
                color = White,
                shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp)
            ),

        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Companion.CenterVertically
    )

    {
        Column(
            Modifier.Companion.border(
                width = 2.dp,
                color = Color.Transparent,
                shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp)
            )
                .height(80.dp).padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "Welcome Back , $name",
                fontFamily = AgileFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Companion.Bold,
                color = White,
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                " Make the day Count!!",
                fontFamily = AgileFont,
                fontSize = 14.sp,
                style = MaterialTheme.typography.bodyLarge
            )
        }
        IconButton(onClick = {}) {
            Icon(
                Icons.Default.Add,
                tint = Color.White,
                contentDescription = "Menu"
            )
        }
    }
}