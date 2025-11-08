package com.example.dailyzen.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.R
import com.example.dailyzen.data.model.userName
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface

@Composable
fun Profile(name: String = userName) {
    val userAvatar = painterResource(R.drawable.avatartwo)
    Box(
        modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Surface, Color.Black
                    )
                ), shape = RectangleShape
            ), contentAlignment = Alignment.BottomCenter
    )
    {
        Image(
            painter = userAvatar,
            contentDescription = "User Avatar",
            modifier = Modifier
                .aspectRatio(1f)

        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.0625f)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent, OnPrimary
                        )
                    ), shape = RectangleShape
                ), contentAlignment = Alignment.BottomCenter
        ) {}

        Text(
            text = userName,
           style = MaterialTheme.typography.displayMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth().padding(2.dp),

            color = Background
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewProfile() {
    Profile("Kushagra")
}