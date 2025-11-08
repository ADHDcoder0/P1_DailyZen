package com.example.dailyzen.data.model

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.dailyzen.R
import com.example.dailyzen.ui.theme.DeepAmber
import com.example.dailyzen.ui.theme.DeepBlue
import com.example.dailyzen.ui.theme.DeepCoral
import com.example.dailyzen.ui.theme.DeepSlate
import com.example.dailyzen.ui.theme.LightAmber
import com.example.dailyzen.ui.theme.LightBlue
import com.example.dailyzen.ui.theme.LightCoral
import com.example.dailyzen.ui.theme.LightSlate
import com.example.dailyzen.ui.theme.MediumAmber
import com.example.dailyzen.ui.theme.MediumBlue
import com.example.dailyzen.ui.theme.MediumCoral
import com.example.dailyzen.ui.theme.MediumSlate


public data class Daily(val id:Int,val title:String,val percent :Float,val Max:Int,@DrawableRes val logo: Int,val dark: Color, val medium:Color, val light:Color)
val DailyList = listOf(
    Daily(9,"Step", .4f, 9000,R.drawable.step,DeepAmber , MediumAmber, LightAmber ),
    Daily(10,"Water", .5f, 4000,R.drawable.avatar,DeepCoral, MediumCoral, LightCoral),
    Daily(11,"Sleep", .4f, 420,R.drawable.avatartwo,DeepSlate, MediumSlate, LightSlate),
    Daily(12, "Screen", .50f, 240,R.drawable.fotordavatar,DeepBlue , MediumBlue, LightBlue),

)