package com.example.dailyzen.ui.Components

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.dailyzen.R
import com.example.dailyzen.ui.testing.Vextor
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.DeepAmber
import com.example.dailyzen.ui.theme.LightAmber
import com.example.dailyzen.ui.theme.MediumAmber
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface

@Composable
fun DailyTrackerBar(id: Int, title: String, percentage: Float, Max: Int, onClick: () -> Unit, logo: Int, dark: Color,

                    medium:Color,
                    light :Color) {
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
        Vextor(dark,medium,light )
        Row(
            modifier = Modifier
                .fillMaxWidth()
               ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                title,
                textAlign = TextAlign.Center,
                color = OnPrimary,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(start=16.dp)

            )
            ImageProgressBar(title, percentage, Max , logo  = painterResource(id = logo))
        }

    }
}

//@Preview(showBackground = true)
//@Composable
//fun DBPreview(){
//    DailyTrackerBar(9,"Step", .4f, 67, {},DeepAmber , MediumAmber, LightAmber)
//}
