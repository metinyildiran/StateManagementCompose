package com.example.statemanagementcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.statemanagementcompose.ui.theme.StateManagementComposeTheme

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
    // State Hoisting
    var text by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpecialText(text = "Test")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialText(text = "Android")
            Spacer(modifier = Modifier.padding(5.dp))
            SpecialTextField(text) {
                text = it
            }
        }
    }
}

@Composable
fun SpecialTextField(text: String, function: (String) -> Unit) {
    TextField(value = text, function)
}

@Composable
fun SpecialText(text: String) {
    Text(text = text, fontSize = 20.sp, fontStyle = FontStyle.Italic)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StateManagementComposeTheme {
        MainScreen()
    }
}
