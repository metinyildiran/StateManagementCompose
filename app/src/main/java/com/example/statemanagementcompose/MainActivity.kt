package com.example.statemanagementcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme 
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.statemanagementcompose.ui.theme.StateManagementComposeTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(color = Color.DarkGray) {
        Column(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {

            Text(text = "Hello!", fontSize = 25.sp, color = Color.White)
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = { println("clicked") }) {
                Text(text = "Text")
            }
            Spacer(modifier = Modifier.padding(5.dp))

            Image(bitmap = ImageBitmap.imageResource(R.drawable.ana_de_armas),
                contentDescription = "Ana De Armas Portrait")

            Image(painter = ColorPainter(Color.White),
                contentDescription = null,
                modifier = Modifier.size(20.dp, 20.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StateManagementComposeTheme {
        MainScreen()
    }
}