package com.example.dailyzen.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.standardQuadTo
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.Green
import com.example.dailyzen.ui.theme.Surface

@Composable
fun Vector2() {
    BoxWithConstraints(
        modifier = Modifier
            .padding(8.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(20.dp))
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color.DarkGray.copy(alpha = 0.85f),
                        Green.copy(alpha = 0.95f)
                    )
                )
            )
    ) {
        val width = constraints.maxWidth.toFloat()
        val height = constraints.maxHeight.toFloat()

        // Medium layer (bottom wave)
        val mediumPath = Path().apply {
            moveTo(0f, height * 0.45f)
            standardQuadTo(
                Offset(width * 0.25f, height * .25f),
                Offset(width * 0.5f, height * 0.6f)
            )
            standardQuadTo(
                Offset(width * 0.75f, height *.02f),
                Offset(width, height * 0.55f)
            )
            lineTo(width, height)
            lineTo(0f, height)
            close()
        }

        // Light layer (upper, softer wave)
        val lightPath = Path().apply {
            moveTo(0f, height * 0.3f)
            standardQuadTo(
                Offset(width * 0.25f, height * 0.2f),
                Offset(width * 0.5f, height * 0.35f)
            )
            standardQuadTo(
                Offset(width * 0.75f, height * 0.45f),
                Offset(1000f, height * 0f)
            )
            lineTo(width, height)
            lineTo(0f, height)
            close()
        }

        Canvas(modifier = Modifier.fillMaxSize()) {
            drawPath(path = mediumPath, color = Surface.copy(alpha = 0.4f))
            drawPath(path = lightPath, color = Background.copy(alpha = 0.7f))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Vector2Preview() {
    Vector2()
}
