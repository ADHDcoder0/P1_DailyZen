package com.example.dailyzen.ui.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.Dark
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White

@Composable
fun DateScroll() {
    var selectedDate by remember { mutableStateOf(0) }
    val day = listOf<String>("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

        Box(
            modifier = Modifier
                .padding(bottom = 8.dp,start=8.dp,end=8.dp)
                .fillMaxWidth()
                .background(Surface, shape = RoundedCornerShape(20.dp))
                .border(width = 2.dp, color = Color.Transparent, shape = RoundedCornerShape(20.dp))
                .clip(shape = RoundedCornerShape(20.dp)),
            contentAlignment = Alignment.TopCenter
        ) {
            LazyRow(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding( top=5.dp,bottom=4.dp,start=2.dp,end=2.dp)

                    .border(
                        width = 2.dp,
                        color = Color.Transparent,
                        shape = RoundedCornerShape(20.dp)
                    ),

                )

            {
                items(365) { index ->
                    Column(modifier= Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally) {

                        Button(
                            onClick = {
                                selectedDate=index
                            },
                            modifier = Modifier

                                .padding(vertical = 3.dp, horizontal = 2.65.dp)
                                .fillMaxWidth()
                                .background(
                                    brush = Brush.linearGradient(
                                        colors =if(selectedDate==index) listOf( OnPrimary, Dark) else listOf( OnPrimary, Background)
                                    ),
                                    shape = RoundedCornerShape(20.dp)
                                )
                                .padding(1.dp) // Border thickness
                                // Inner background layer
                                .background(
                                    color =if(selectedDate==index)Dark else Background,
                                    shape = RoundedCornerShape(20.dp)
                                )
                                ,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = if(selectedDate==index)Dark else Background
                            )
                            // .padding(.dp)
                        ) {
                            Text(
                                "${(index % 31) + 1}",
                                style= MaterialTheme.typography.bodyMedium,
                                color = White,modifier=Modifier.padding(top=3.dp, bottom = 2.dp,end=1.5.dp),
                            )
                        }
                        Text(
                            day[index % 7],
                            style = MaterialTheme.typography.titleSmall,
                            color = White,modifier=Modifier.fillMaxSize().padding(top=3.dp, bottom = 0.dp),
                            textAlign = TextAlign.Center,


                        )
                    }
                }
            }
        }
    }

@Composable
@Preview(showBackground = true)
fun PrevDate(){
    DateScroll()
}