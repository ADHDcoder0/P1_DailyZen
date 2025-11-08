package com.example.dailyzen.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.MediumAmber
import com.example.dailyzen.ui.theme.OnPrimary


@Composable
fun Journal(date: Int, day: String, month: String, content: String, title: String) {
    var text by remember { mutableStateOf(content) }
    var journaltitle by remember { mutableStateOf(title)}
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    val focusManager2 = LocalFocusManager.current
    Column(modifier = Modifier
        .background(Background)
        .fillMaxSize()) {
        TopBar("$date $month")
        TextField(
            modifier = Modifier.fillMaxWidth()
                .padding(start=6.dp,end=6.dp,top=10.dp),
            keyboardActions = KeyboardActions(
                onDone = {
                    // Hide keyboard
                    keyboardController?.hide()
                    focusManager2.clearFocus()
                    // Maybe save entry or show a toast, etc.
                    println("User finished typing: $journaltitle")
                }
            ),
            value = journaltitle,
            onValueChange = { journaltitle = it },
            textStyle = MaterialTheme.typography.titleLarge.copy(
                textAlign = TextAlign.Center,
                color = OnPrimary,
                fontFamily = AgileFont
            ),
            placeholder = { Text("How was Your Day !?") },
            maxLines = 1,

        )
            TextField(
                modifier = Modifier
                    .padding(start=10.dp,end=10.dp,bottom=10.dp)
                    .fillMaxWidth()
                    .height(500.dp)
                    .clip(RoundedCornerShape(20.dp))
                    .padding(1.dp) // Border thickness
                // Inner background layer
                , keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done
                ),
                keyboardActions = KeyboardActions(
                    onDone = {
                        // Hide keyboard
                        keyboardController?.hide()
                        focusManager.clearFocus()
                        // Maybe save entry or show a toast, etc.
                        println("User finished typing: $text")
                    }
                ),


                value = text,
                onValueChange = { text = it },
                placeholder = { Text("How was Your Day !?") },
                maxLines = 20,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.DarkGray,
                    disabledContainerColor = Color.Green,
                    errorContainerColor = Color.Yellow,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    cursorColor = MediumAmber

                )
            )
    }
}

//@Preview
//@Composable
//fun PrevJournal() {
//    Journal()
//}