package com.example.vamz_sp_

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.vamz_sp_.ui.theme.VAMZ_SP_Theme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VAMZ_SP_Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Prihlasenie()
                    Email()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Helloaaaaa $name!",
        modifier = modifier
    )
}

@Composable
fun Prihlasenie(modifier: Modifier = Modifier) {
    Text(
        text = "Prihlásiť sa",
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 132.dp),
        fontSize = 24.sp,
        color = Color.Black,
        textAlign = TextAlign.Center
    )
}

@Composable
fun Email() {
    Text(
        text = "Email",
        modifier = Modifier
            .width(109.dp)
            .height(28.dp)
            .padding(start = 44.dp, top = 259.dp),
        fontSize = 20.sp,
        color = Color.Black,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VAMZ_SP_Theme {

        Prihlasenie()
        Email()
    }
}