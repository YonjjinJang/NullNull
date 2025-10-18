package com.example.nullnull

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextComponent(){
    Text(text = "Compose", color = Color.White)
}

@Preview
@Composable
private fun TextComponentPreview() {
    TextComponent()
}
