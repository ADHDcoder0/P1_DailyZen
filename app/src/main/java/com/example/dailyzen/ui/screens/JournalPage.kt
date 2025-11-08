package com.example.dailyzen.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.dailyzen.data.model.AgileFont
import com.example.dailyzen.data.model.JournalList
import com.example.dailyzen.navigation.Screen
import com.example.dailyzen.ui.components.JournalTile
import com.example.dailyzen.ui.components.TopBar
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.OnPrimary

@Composable
fun JournalPage(Date: Int=30, Day: String="Sunday",navController: NavController){
    Column(modifier = Modifier.fillMaxSize().background(Background)) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),modifier = Modifier.weight(1f),
            userScrollEnabled = true) {
            item(span = { GridItemSpan(maxLineSpan) }) { TopBar("Journal") }
            item(span = { GridItemSpan(maxLineSpan) }){
                Column(
                    Modifier
                        .padding(6.dp)

                        .padding(10.dp)
                )
                {
                    Row(Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "$Date October",
                            color = OnPrimary,
                            fontFamily = AgileFont,
                            fontSize = 22.sp
                        )
                    }
                    Text(
                        "$Day ",
                        fontFamily = AgileFont,
                        color = OnPrimary,
                        fontSize = 14.sp,
                        modifier = Modifier
                    )
                }
            }
            items (JournalList  ){
                journal->
                JournalTile(journal.title, journal.date,journal.day,journal.month,journal.dark,{navController.navigate(Screen.JournalDaily.passId(journal.id))},journal.medium,journal.Light
                )
            }
        }

    }
}
//@Preview(showBackground = true)
//@Composable
//fun prevJournalPage(){
//
//    JournalPage()
//
//}