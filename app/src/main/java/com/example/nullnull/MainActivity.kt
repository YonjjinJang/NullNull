package com.example.nullnull

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NullNull()
        }
    }
}

@Composable
fun NullNull() {
    val context = LocalContext.current
    var imageState by remember { mutableIntStateOf(R.drawable.ic_tj_old) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        Column {
            Text(text = "Compose", color = Color.White)
            Text(text = "Compose", color = Color.White)
            Text(text = "Compose", color = Color.White)
            TextComponent()
        }
        Row {
            Text(text = "Compose", color = Color.White)
            Text(text = "Compose", color = Color.White)
            Text(text = "Compose", color = Color.White)
            TextComponent()
        }
        Column {
            for (i in 0 until 5) {
                Text("Compose $i", color = Color.White)
            }
        }
        Row() {
            for (i in 0 until 5) {
                TextComponentIdx(i)
            }
        }
        Row {
            Button(onClick = {
                Toast.makeText(context, "Hello 👋", Toast.LENGTH_SHORT).show()
            }) { Text("Hello 토스트 띄어보자") }
            Button(onClick = {
                imageState = if (imageState == R.drawable.ic_tj_old) R.drawable.ic_tj_new
                else R.drawable.ic_tj_old
            }) { Text("이미지를 바꿔보자") }
        }
        Image(
            modifier = Modifier
                .width(600.dp)
                .height(450.dp),
            painter = painterResource(id = imageState),
            contentDescription = "이미지",
        )

        // TODO 토스트 메시지를 띄운 횟수를 보여주는 Text를 만들어보자
    }
}

@Preview
@Composable
fun NullNullPreview() {
    NullNull()
}
