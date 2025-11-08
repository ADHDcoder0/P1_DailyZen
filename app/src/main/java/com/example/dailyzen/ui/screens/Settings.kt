package com.example.dailyzen.ui.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.ui.components.Profile
import com.example.dailyzen.ui.components.TopBar
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.OnPrimary
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White

@Composable
fun Settings() {
    var isChecked by remember { mutableStateOf(false) }
    var isCheckedNot by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TopBar("Settings")

        Row(
            modifier = Modifier

                .padding(15.dp)
                .border(width = .5.dp, color = White, shape = RoundedCornerShape(60.dp))
                .clip(RoundedCornerShape(60.dp))
                .background(Surface)
                .fillMaxWidth(.7f)

               ,
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Bottom
        ) { Profile("User") }

        Row(
            modifier = Modifier
                .padding(5.dp)
                .border(width = .5.dp, color = White, shape = RoundedCornerShape(16.dp))
                .clip(RoundedCornerShape(16.dp))
                .background(Surface)
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 2.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Dark/Light Mode",color=OnPrimary, style= MaterialTheme.typography.titleSmall)
            Switch(
                checked = isChecked,
                onCheckedChange = {
                    isChecked = it
                    if (it) {
                        Log.d("ToggleSwitch", "Switch turned ON")
                        //DarkTheme
                    } else {
                        Log.d("ToggleSwitch", "Switch turned OFF")
                        //LightTheme
                    }

                }
            )

        }
        Row(
            modifier = Modifier
                .padding(5.dp)
                .border(width = .5.dp, color = White, shape = RoundedCornerShape(16.dp))
                .clip(RoundedCornerShape(16.dp))
                .background(Surface)
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 2.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Notification ON/OFF",color=OnPrimary, style= MaterialTheme.typography.titleSmall)
            Switch(
                checked = isCheckedNot,
                onCheckedChange = {
                    isCheckedNot = it
                    if (it) {
                        Log.d("ToggleSwitch", "Notifiaction ON")
                        //DarkTheme
                    } else {
                        Log.d("ToggleSwitch", "Notification Off")
                        //LightTheme
                    }

                }
            )

        }

    }
}

@Preview(showBackground = true)
@Composable
fun SettingsPagePreview() {
    Settings()
}