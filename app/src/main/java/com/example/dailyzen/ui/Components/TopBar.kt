package com.example.dailyzen.ui.Components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.ui.theme.Green

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title:String,
    color: Color =Green,

) {
    //val modiferWeekBar = Modifier
    TopAppBar(
        title = { Text(title, fontFamily = AgileFont, color = Color.White) },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(
                    imageVector=Icons.Filled.ExpandMore,
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

