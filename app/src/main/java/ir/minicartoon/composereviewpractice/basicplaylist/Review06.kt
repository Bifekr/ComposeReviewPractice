package ir.minicartoon.composereviewpractice.basicplaylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ir.minicartoon.composereviewpractice.basicplaylist.ui.theme.ComposeReviewPracticeTheme
import kotlin.random.Random

class Review06 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            StateBasic()
            val updateColor = remember{ mutableStateOf(Color.Yellow) }
            Column(modifier=Modifier.fillMaxSize()){
                BoxesColor(modifier = Modifier.weight(.5f).fillMaxSize() ){
                    updateColor.value=it
                }
                Box(modifier = Modifier
                    .weight(0.5f)
                    .fillMaxSize()
                    .background(updateColor.value))
            }

        }
    }
}

//Second Review
@Composable
fun StateBasic(){

    var color= remember{ mutableStateOf(Color.Yellow) }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        })
}
@Composable
fun BoxesColor(modifier: Modifier,color:(Color)->Unit){

    Box(modifier
        .background(Color.Cyan)
        .clickable {
            color(
                Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            )

        })

}

//review third
@Composable
fun ChangeBackground() {
    var color = remember { mutableStateOf(Color.Cyan) }
    Column(modifier = Modifier
        .fillMaxSize()
    )
    {
        Box(modifier = Modifier.weight(1f)
            .fillMaxSize()
//            .background(color.value)
            .clickable {
                color.value = Color(
                    Random.nextFloat(),
                    Random.nextFloat(),
                    Random.nextFloat(),
                    1f
                )
            }
        )
        Box(modifier = Modifier.weight(1f)
            .fillMaxSize()
            .background(color.value))
    }
}