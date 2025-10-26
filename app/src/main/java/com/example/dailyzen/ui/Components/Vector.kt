package com.example.dailyzen.ui.Components


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailyzen.standardQuadTo
import com.example.dailyzen.ui.theme.Background
import com.example.dailyzen.ui.theme.Surface
import com.example.dailyzen.ui.theme.White

@Composable
fun Vector(color1: Color,color2: Color,color3: Color,
           ){
    BoxWithConstraints (modifier= Modifier.padding(8.dp)

        .clip(RoundedCornerShape(20.dp))
        .background(color3.copy(.3f))){
            val width = constraints.maxWidth
            val  height =constraints.maxHeight

        //MediumColorPath =Offset(of
       val  mediumColorPath1 =Offset(0f,height*0.3f)
        val  mediumColorPath2 =Offset(width*0.1f,height*0.35f)
        val  mediumColorPath3 =Offset(width*0.4f,height*0.05f)
        val  mediumColorPath4 =Offset(width*0.75f,height*0.5f)
        val  mediumColorPath5 =Offset(width*2f,height*0.6f)

        val mediumColorPath =Path().apply{
            moveTo(mediumColorPath1.x,mediumColorPath1.y)
//            quadraticTo(
//                mediumColorPath2.x,
//                mediumColorPath2.y,
//                (mediumColorPath1.x+mediumColorPath2.x)/2f,
//                (mediumColorPath1.y+mediumColorPath2.y)/2f
//            )
            standardQuadTo(mediumColorPath1,mediumColorPath2)
            standardQuadTo(mediumColorPath2,mediumColorPath3)
            standardQuadTo(mediumColorPath3,mediumColorPath4)
            standardQuadTo(mediumColorPath4,mediumColorPath5)
            standardQuadTo(mediumColorPath5,mediumColorPath1)
            lineTo(width.toFloat()*100f,height.toFloat()*100f)
            lineTo(-100f,height.toFloat()*100f)
            close()

        }
        val lightColorPath1 = Offset(0f, height * 0.35f)
        val lightColorPath2 = Offset(width * 0.1f, height * 0.4f)
        val lightColorPath3 = Offset(width * 0.32f, height * 0.33f)
        val lightColorPath4 = Offset(width * 0.85f, height*.65f)
        val lightColorPath5 = Offset(width * 1.4f, -height.toFloat()/3f)

        val lightColorPath = Path().apply {
            moveTo(lightColorPath1.x, lightColorPath1.y)
            standardQuadTo(lightColorPath1, lightColorPath2)
            standardQuadTo(lightColorPath2, lightColorPath3)
            standardQuadTo(lightColorPath3, lightColorPath4)
            standardQuadTo(lightColorPath4, lightColorPath5)
            standardQuadTo(lightColorPath5, lightColorPath1)
            lineTo(width.toFloat() * 100f, height.toFloat() * 7f)
            lineTo(-10f, height.toFloat() * 10f)
            close()
        }
        Canvas(
            modifier =Modifier.matchParentSize().clip(RoundedCornerShape(20.dp))
        ){
            drawPath(path = mediumColorPath,color = color1.copy(.5f))
            drawPath(path = lightColorPath,color = color2.copy(.4f))
        }


    }

}


@Preview(showBackground = true)
@Composable
fun VectorPreview() {
    Vector(Surface,Background,White)
}

