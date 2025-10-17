package com.example.dailyzen

// Importing Material3 components
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailyzen.Components.Greeting
import com.example.dailyzen.Components.TopBar
import com.example.dailyzen.Pages.DashBoard
import com.example.dailyzen.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DailyZenTheme {
                DashBoard()
                }
                }
            }

    }

@Preview(showBackground = true)
@Composable
fun Preview() {
    TopBar()
    Greeting("Kushagra")
}