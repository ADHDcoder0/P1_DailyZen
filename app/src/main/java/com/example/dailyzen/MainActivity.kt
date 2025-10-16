package com.example.dailyzen

// Importing Material3 components
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.dailyzen.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DailyZenTheme {
                Column(modifier = Modifier.fillMaxSize().background(ligherGreen)) {
                    TopBar()
                    Greeting("Kushagra")
                    DateScroll()
                    MoodGrit()
                    //HabitTile()
                    Column(modifier= Modifier.verticalScroll(rememberScrollState())) {
                        HabitBar("Cycling", .4f, 67)
                        HabitBar("Running", .5f, 21)
                        HabitBar("DSA", .69f, 120)
                        HabitBar("Kotlin", .12f, 33)
                        HabitBar("Task", .4f, 67)
                        HabitBar("Flask", .69f, 120)
                        HabitBar("Murder", .02f, 50)
                        HabitBar("Human", .9f, 365)
                    }

                    }
                }
                }
            }

    }
val AgileFont = FontFamily(
    Font(R.font.agilee) // replace with your actual font filename in res/font
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    color: Color =Green
) {
    //val modiferWeekBar = Modifier
                TopAppBar(
                    title = { Text("DailyZen", fontFamily = AgileFont, color = Color.White) },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(
                                Icons.Default.Menu,
                                tint = Color.White,
                                contentDescription = "Menu"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Green
                    )
                )
            }
@Composable
fun DateScroll(){
    val day = listOf<String>("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)

    ){
        Box(modifier = Modifier.fillMaxWidth()
            .height(100.dp)
            .background(Lightgreen, shape = RoundedCornerShape(20.dp))
            .border(width=2.dp,color=Color.Transparent,shape= RoundedCornerShape(20.dp))
        ) {
            LazyRow (verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier=Modifier
                    .padding(10.dp)
                    .border(width=2.dp,color =Color.Transparent,shape =RoundedCornerShape(20.dp))){
                items(365) { index ->
                    ConstraintLayout {
                        val(button ,text) = createRefs()
                        Button(
                            onClick = {},
                            modifier = Modifier.border(
                                width = 2.dp,
                                color = White,
                                shape = RoundedCornerShape(18.dp)

                            )
                                .constrainAs(button){top.linkTo(parent.top)},
                            colors = ButtonDefaults.buttonColors(
                                containerColor =Green
                            )
                            // .padding(.dp)
                        ) {
                            Text("${index + 1}")
                        }
                        Text(day[index%7],
                            fontFamily = AgileFont,
                            modifier = Modifier.constrainAs(text){ top.linkTo(button.bottom)
                                start.linkTo(button.start)
                                end.linkTo(button.end)}
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(nam:String){
    val name = nam
    Row(modifier =Modifier
        .fillMaxWidth()
        .padding(5.dp)
        .background(Lightgreen,shape = RoundedCornerShape(20.dp))
        .border(width=2.dp,color=White,shape= RoundedCornerShape(20.dp)),

        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically)

    {
        Column(Modifier.border(width=2.dp,color =Color.Transparent,shape =RoundedCornerShape(20.dp))
            .height(80.dp).padding(10.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text("Welcome Back , $name",
                fontFamily = AgileFont,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = White,
                style = MaterialTheme.typography.headlineSmall)
            Text(" Make the day Count!!",
                fontFamily = AgileFont,
                fontSize = 14.sp,
                style = MaterialTheme.typography.bodyLarge)
        }
        IconButton(onClick = {}) {
            Icon(
                Icons.Default.Add,
                tint = Color.White,
                contentDescription = "Menu"
            )
        }
    }
}
@Composable
fun MoodGrit(title:String="Grit"){
    Row( modifier = Modifier
        .fillMaxWidth()
        .padding(6.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically){
        Column(modifier = Modifier.weight(1f).aspectRatio(1.25f)


            .border(width=2.dp,color=Color.White,shape= RoundedCornerShape(20.dp))
            .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)) {
            Text("I am Feeling",
                fontFamily = AgileFont)
            Text("\uD83D\uDE00",
                fontSize = 60.sp
                )
        }
        Column(modifier = Modifier.border(width=2.dp,color=Color.White,shape= RoundedCornerShape(20.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
            Text(title,
                fontFamily = AgileFont,
                modifier = Modifier.padding(10.dp),
                textAlign = TextAlign.Center,
                fontSize = 22.sp
            )
            ProgressBar(title,0.8f,160)
        }


    }
}


@Composable
fun ProgressBar(title:String,
                percentage:Float,
                Max:Int,
                fontSize : TextUnit=28.sp,
                radius :Dp= 50.dp,
                color: Color = Green,
                strokeWidth: Dp =8.dp,
                animaDuration : Int =1000,
                animaDelay: Int =0) {
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
    Column(modifier = Modifier
        .fillMaxWidth(.5f)
        .padding(6.dp),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.SpaceBetween) {



        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(radius * 2f)
        ) {

            Canvas(
                modifier = Modifier.size(radius * 2f)
                    .padding(10.dp)
            ) {
                drawArc(
                    color = color,
                    -90f,
                    sweepAngle = 360 * curPercentage.value,
                    useCenter = false,
                    style = Stroke(strokeWidth.toPx(), cap = StrokeCap.Round)
                )
            }
            Text(
                text = (curPercentage.value * Max).toInt().toString(),
                modifier = Modifier.clickable {
                    if (aniPlay)
                        aniPlay = false
                    // Re-trigger recomposition + animation
                    else (!aniPlay)
                    aniPlay = true
                },
                fontSize = fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun HabitBar(title:String,percentage:Float,Max:Int){
    Row(modifier=Modifier.padding(8.dp).border(width=2.dp,color=White,shape= RoundedCornerShape(20.dp))

        .background(Lightgreen,shape= RoundedCornerShape(20.dp))
        .fillMaxWidth()
        .clip(shape= RoundedCornerShape(20.dp))
        .padding(horizontal=16.dp,vertical = 2.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){
        Text(title,
            textAlign = TextAlign.Center, fontFamily = AgileFont, color = Color.Black, fontSize = 30.sp)
        ProgressBar(title,percentage,Max)
    }

}
@Preview(showBackground = true)
@Composable
fun Preview() {
    TopBar()
    Greeting("Kushagra")
}