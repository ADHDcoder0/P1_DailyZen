package com.example.dailyzen.ui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.theme.Dark
import com.example.dailyzen.ui.theme.OnPrimary

@Composable
fun FAB(navController: NavController) {
    val navBackStackEntry = navController.currentBackStackEntryAsState()

    Box(modifier=Modifier.fillMaxSize()) {
        ExtendedFloatingActionButton(
            shape = RoundedCornerShape(70.dp),
            contentColor = contentColorFor(Dark),
            modifier = Modifier.align(Alignment.BottomEnd).height(55.dp).width(55.dp),
            onClick = {

                navController.navigate(Screen.Home.route) {
                    popUpTo(Screen.Home.route)
                    launchSingleTop = true
                }

            }
        ) {
            Image(imageVector = Icons.Filled.Add, contentDescription = null, colorFilter = ColorFilter.tint(OnPrimary))
        }
    }
}

@Composable
@Preview
fun PrevFAB( ){
    FAB(navController= rememberNavController())
}
