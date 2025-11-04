package com.example.nullnull.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.nullnull.component.SplashLogo

@Composable
fun SplashScreen(
    navigateToNullNull: () -> Unit
) {
    // TODO LaunchedEffect를 이용하여 delay 2초 뒤 navigateToNullNull 실행

    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        SplashLogo()
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
private fun SplashScreenPreview() {
    SplashScreen(
        navigateToNullNull = {}
    )
}
