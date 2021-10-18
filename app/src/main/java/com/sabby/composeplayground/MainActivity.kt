package com.sabby.composeplayground

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sabby.composeplayground.ui.statechange.MultiComponentStateActivity
import com.sabby.composeplayground.ui.statechange.SingleComponentStateActivity
import com.sabby.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                ShowStateActivityButtons()
            }
        }
    }

    @Composable
    private fun ShowStateActivityButtons() {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = {
                    startActivity(
                        Intent(
                            this@MainActivity,
                            SingleComponentStateActivity::class.java
                        )
                    )
                },Modifier.padding(bottom = 10.dp)
            ) {
                Text(text = "Open Single Component State activity")
            }

            Button(
                onClick = {
                    startActivity(
                        Intent(
                            this@MainActivity,
                            MultiComponentStateActivity::class.java
                        )
                    )
                },
            ) {
                Text(text = "Open Multi Component State activity")
            }
        }
    }

}
