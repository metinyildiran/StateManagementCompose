package com.example.statemanagementcompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OtherScreen() {
    Surface(color = Color.DarkGray) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            var myString by remember { mutableStateOf("Text") }

            TextField(value = myString, onValueChange = {
                myString = it
            })

            var textString by remember { mutableStateOf("Hello!") }

            Text(text = textString, fontSize = 25.sp, color = Color.White)
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = { textString = "Hi!" }) {
                Text(text = "Text")
            }
            Spacer(modifier = Modifier.padding(5.dp))
        }
    }
}
