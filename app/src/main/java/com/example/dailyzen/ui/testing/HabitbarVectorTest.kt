package com.example.dailyzen.ui.testing

import com.example.dailyzen.ui.components.ProgressBar
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White

@Composable
fun HabtBar(id: Int, title: String, percentage: Float, Max: Int, onClick: () -> Unit,dark: Color,medium:Color,light:Color) {

        Box(
            modifier = Modifier
                .padding(bottom = 8.dp, start = 8.dp, end = 8.dp)
                .fillMaxWidth()
                .height(100.dp)
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
                )


                .clickable { onClick() },
        ) {
            Vextor(Surface,Background,Color.Gray)
            Row(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    title,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                )
                ProgressBar(title, percentage, Max, radius = 46.dp)
            }

        }
    }


