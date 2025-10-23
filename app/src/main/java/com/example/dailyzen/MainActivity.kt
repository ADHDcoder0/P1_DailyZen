package com.example.dailyzen

// Importing Material3 component

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dailyzen.navigation.SetupNavGraph
import com.example.dailyzen.ui.Components.BottomBar

import com.example.dailyzen.ui.theme.*



class MainActivity : ComponentActivity() {
    lateinit var navController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DailyZenTheme {
                navController = rememberNavController()
                Scaffold(containerColor = Color.Transparent,
                    contentWindowInsets = WindowInsets(0, 0, 0, 0),
                    bottomBar = {
                        BottomBar(navController)
                    }
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        SetupNavGraph(navController = navController)
                    }
                }
            }
                }
            }

    }

@Preview(showBackground = true)
@Composable
fun Preview() {
   // TopBar()
    //Greeting("Kushagra")
     //DailyPages(10,"Satruday")

}