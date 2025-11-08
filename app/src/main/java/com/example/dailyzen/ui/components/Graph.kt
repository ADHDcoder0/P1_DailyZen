package com.example.dailyzen.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.ui.theme.Surface
import kotlin.Float

val websiteVisits = listOf(
    32f, 28f, 35f, 50f, 45f, 60f,
    55f, 52f, 70f, 65f, 75f, 68f
)
val websiteVisits2 = listOf(

    55f, 52f, 70f, 65f, 75f, 68f,
    32f, 28f, 35f, 50f, 45f, 60f
)
@Composable
fun Graph(data1: List<Float>,data: List<Float>) {
    Box {
        Canvas(modifier = Modifier.size(300.dp).background(Surface)) {
            val maxY = data.maxOrNull() ?: 0f
            val stepX = size.width / (data.size - 1)
            val scaleY = size.height / maxY

            val path = Path().apply {
                data1.forEachIndexed { index, value ->
                    val x = stepX * index
                    val y = size.height - (value * scaleY)
                    if (index == 0) moveTo(x, y) else lineTo(x, y)
                }
            }

            drawPath(path, color = Color.White, style = Stroke(width = 10f))
        }

        Canvas(modifier = Modifier.size(300.dp).background(Color.Transparent)) {
            val maxY = data.maxOrNull() ?: 0f
            val stepX = size.width / (data.size - 1)
            val scaleY = size.height / maxY

            val path = Path().apply {
                data.forEachIndexed { index, value ->
                    val x = stepX * index
                    val y = size.height - (value * scaleY)
                    if (index == 0) moveTo(x, y) else lineTo(x, y)
                }
            }

            drawPath(path, color = Color.Red, style = Stroke(width = 10f))
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LineChartPreview(){

}
