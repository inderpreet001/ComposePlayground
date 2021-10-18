package com.sabby.composeplayground.ui.statechange

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MultiComponentStateActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                val count = remember {
                    mutableStateOf(0)
                }

                Text(text = "The value of count is ${count.value}")


                ShowCountIncButton(count.value) {
                    count.value = it
                }
            }
        }
    }

    @Composable
    private fun ShowCountIncButton(countValue: Int, updateCount: (Int) -> Unit) {
        var count = countValue + 1

        Button(onClick = { updateCount(count) }) {
            Text(text = "click here to inc value in text field")
        }

    }

}