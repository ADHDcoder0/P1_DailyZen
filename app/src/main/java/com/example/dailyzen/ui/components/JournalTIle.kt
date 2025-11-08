package com.example.dailyzen.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.dailyzen.ui.testing.Vextor
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.DeepGreen
import com.example.dailyzen.ui.theme.LightGreen
import com.example.dailyzen.ui.theme.MediumGreen
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White

@Composable
fun JournalTile(
    title: String,
    date: Int,
    day: String,
    month: String,
    dark: Color,
    onClick: () -> Unit,
    medium: Color,
    light: Color
) {
    Box(
        modifier = Modifier.clickable { onClick() }
            .fillMaxSize(.5f)
            .padding(top = 6.dp, start = 6.dp)
            .aspectRatio(1f)
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
            ), contentAlignment = Alignment.BottomCenter
    ) {
        Vextor(dark, medium, Background)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column(verticalArrangement = Arrangement.Center) {
                    Text("$date $day", textAlign = TextAlign.Start,style = MaterialTheme.typography.titleSmall,
                        color = White,modifier=Modifier.fillMaxWidth().padding(top=3.dp, bottom = 0.dp),
                    )
                    Text("$month", textAlign = TextAlign.Start,style = MaterialTheme.typography.titleSmall,
                        color = White,modifier=Modifier.fillMaxWidth().padding(top=3.dp, bottom = 0.dp),
                    )
                }
                Text(
                    title, color = White, style = MaterialTheme.typography.titleLarge,textAlign = TextAlign.Start,

                )
            }
        }
    }
}

//@Preview
//@Composable
//fun PrevJournalTile() {
//
//    JournalTile(
//        date = 5, day = "Sun", month = "OCt",
//        title = "A Small Win", dark = DeepGreen, medium = MediumGreen, light = LightGreen
//    )
//}