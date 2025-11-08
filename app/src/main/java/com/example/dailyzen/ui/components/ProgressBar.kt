package com.example.dailyzen.ui.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.dailyzen.ui.theme.*


@Composable
fun ProgressBar(
    title: String,
    percentage: Float,
    Max: Int,
    radius: Dp = 50.dp,
    color: Color = OnBackground,
    strokeWidth: Dp = 8.dp,
    animaDuration: Int = 1000,
    animaDelay: Int = 0
) {
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
    Column(
        modifier = Modifier

            .padding(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {


        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(radius * 2f)
        ) {

            Canvas(
                modifier = Modifier
                    .size(radius * 2f)
                    .padding(10.dp)
                    .aspectRatio(1f)
            ) {
                drawArc(
                    color = if (percentage < 0.25f) SoftRed else if (percentage < 0.5f && percentage >= 0.25f) SoftOrange else if (percentage >= 0.5 && percentage < 0.75f) SoftYellow else SoftGreen,
                    -90f,
                    sweepAngle = 360 * curPercentage.value,
                    useCenter = false,
                    style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
                )
            }
            Text(
                text = (curPercentage.value * Max).toInt().toString(), color = OnBackground,
                modifier = Modifier
                    .clickable {
                        if (aniPlay)
                            aniPlay = false
                        // Re-trigger recomposition + animation
                        else (!aniPlay)
                        aniPlay = true
                    }
                    .padding(top = 5.5.dp),
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ProgressBar("Daily Task", 0.8f, 160)
}