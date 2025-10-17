package com.example.dailyzen.Components

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
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyzen.Values.AgileFont
import com.example.dailyzen.ui.theme.Green
import com.example.dailyzen.ui.theme.Lightgreen
import com.example.dailyzen.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    color: Color =Green
) {
    //val modiferWeekBar = Modifier
    TopAppBar(
        title = { Text("DailyZen", fontFamily = AgileFont, color = Color.White) },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    Icons.Default.Menu,
                    tint = Color.White,
                    contentDescription = "Menu"
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Green
        )
    )
}

