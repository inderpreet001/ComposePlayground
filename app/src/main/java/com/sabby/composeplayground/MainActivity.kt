package com.sabby.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.sabby.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    private val fontFamily = FontFamily(
        Font(R.font.montserrat_regular),
        Font(R.font.montserrat_bold, FontWeight.Bold),
        Font(R.font.montserrat_medium, FontWeight.Medium)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposePlaygroundTheme {
                Column {
                    Greeting("Compose Playground")
                    TextWithFontFamily(name = "Text with different font", fontFamily)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "$name!", color = Color.Cyan, fontSize = 20.sp)
}

@Composable
fun TextWithFontFamily(name: String, fontFamily: FontFamily) {
    Text(text = "$name!", color = Color.Red, fontFamily = fontFamily, fontWeight = FontWeight.Bold)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePlaygroundTheme {
        Greeting("Android")
        TextWithFontFamily(
            "Android", fontFamily = FontFamily(
                Font(R.font.montserrat_regular),
                Font(R.font.montserrat_bold, FontWeight.Bold),
                Font(R.font.montserrat_medium, FontWeight.Medium)
            )
        )
    }
}
