package com.example.dailyzen.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dailyzen.Values.AgileFont
import com.example.dailyzen.ui.theme.Green
import com.example.dailyzen.ui.theme.Lightgreen
import com.example.dailyzen.ui.theme.White

@Composable
fun HabitBar(title:String,percentage:Float,Max:Int){
    Row(modifier=Modifier.padding(8.dp).border(width=2.dp,color=White,shape= RoundedCornerShape(20.dp))

        .background(Lightgreen,shape= RoundedCornerShape(20.dp))
        .fillMaxWidth()
        .clip(shape= RoundedCornerShape(20.dp))
        .padding(horizontal=16.dp,vertical = 2.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){
        Text(title,
            textAlign = TextAlign.Center, fontFamily = AgileFont, color = Color.Black, fontSize = 30.sp)
        ProgressBar(title, percentage, Max)
    }

}

@Composable
fun DateScroll(){
    val day = listOf<String>("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)

    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .height(100.dp)
                .background(Lightgreen, shape = RoundedCornerShape(20.dp))
                .border(width = 2.dp, color = Color.Transparent, shape = RoundedCornerShape(20.dp))
        ) {
            LazyRow(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(10.dp)
                    .border(
                        width = 2.dp,
                        color = Color.Transparent,
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                items(365) { index ->
                    ConstraintLayout {
                        val (button, text) = createRefs()
                        Button(
                            onClick = {},
                            modifier = Modifier.border(
                                width = 2.dp,
                                color = White,
                                shape = RoundedCornerShape(18.dp)

                            )
                                .constrainAs(button) { top.linkTo(parent.top) },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Green
                            )
                            // .padding(.dp)
                        ) {
                            Text("${index + 1}")
                        }
                        Text(
                            day[index % 7],
                            fontFamily = AgileFont,
                            modifier = Modifier.constrainAs(text) {
                                top.linkTo(button.bottom)
                                start.linkTo(button.start)
                                end.linkTo(button.end)
                            }
                        )
                    }
                }
            }
        }
    }
}