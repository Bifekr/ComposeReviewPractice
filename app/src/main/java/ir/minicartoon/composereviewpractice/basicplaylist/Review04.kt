package ir.minicartoon.composereviewpractice.basicplaylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ir.minicartoon.composereviewpractice.R
import ir.minicartoon.composereviewpractice.basicplaylist.ui.theme.ComposeReviewPracticeTheme

class Review04 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.samplepik)
            val title = "this just create for be good to writing code and be good what eve you want"

            ImageCard(painter = painter, title = title, description = title)
        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    title: String,
    description: String,
    modifier: Modifier=Modifier
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Box(Modifier.height(200.dp)) {

            Image(
                painter = painter,
                contentDescription = description,
                contentScale = ContentScale.Crop
            )
            Box(
                modifier
                    .fillMaxSize()
                    .background(brush= Brush.verticalGradient(
                        colors= listOf(
                            Color.Transparent,
                            Color.Black
                        ), startY = 300f
                    ))){

            }
            Box(modifier = Modifier.fillMaxSize().padding(8.dp), contentAlignment = Alignment.BottomStart) {
                Text(text = title,color= Color.White)
            }


        }
    }


}