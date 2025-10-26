package com.example.dailyzen.ui.Components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dailyzen.R
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.SoftGreen
import com.example.dailyzen.ui.theme.SoftOrange
import com.example.dailyzen.ui.theme.SoftRed
import com.example.dailyzen.ui.theme.SoftYellow
import com.example.dailyzen.ui.theme.Surface


@Composable

fun ImageProgressBar(title:String,
                     percentage:Float,
                     Max:Int,
                     fontSize : TextUnit=28.sp,
                     radius :Dp= 46.dp,
                     color: Color = OnPrimary,
                     strokeWidth: Dp =8.dp,
                     animaDuration : Int =1000,
                     animaDelay: Int =0,
                     logo: Painter
) {
    val stepLogo = painterResource( R.drawable.step)
    var aniPlay by remember(title) {
        mutableStateOf(false)
    }
    val curPercentage = animateFloatAsState(
        targetValue = if (aniPlay) percentage else 0f,
        animationSpec = tween(
            durationMillis = animaDuration,
            delayMillis = animaDelay
        )
    )
    LaunchedEffect(true) {
        aniPlay = true
    }
    Column(modifier = Modifier
        .fillMaxWidth(.5f)
        .padding(2.dp).background(Color.Transparent),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {



        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(radius * 2f)
        ) {

            Canvas(
                modifier = Modifier.size(radius * 2f)
                    .padding(10.dp)
            ) {
                drawArc(
                    color = if (percentage < 0.25f) SoftRed else if (percentage < 0.5f && percentage >= 0.25f) SoftOrange else if (percentage >= 0.5 && percentage < 0.75f) SoftYellow else SoftGreen,
                    -90f,
                    sweepAngle = 360 * curPercentage.value,
                    useCenter = false,
                    style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
                )
            }
            Image(
                painter = logo,
                contentDescription = "User Avatar",
                modifier = Modifier.size(45.dp)
            )
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun IPBPreview(){
//    ImageProgressBar("Steps",0.9f,10000)
//}