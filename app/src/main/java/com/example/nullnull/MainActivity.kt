package com.example.nullnull

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.nullnull.presentation.NullNullScreen
import com.example.nullnull.presentation.ScreenState
import com.example.nullnull.presentation.SplashScreen
import com.example.nullnull.presentation.StoreScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var currentScreenState by remember { mutableStateOf<ScreenState>(ScreenState.Splash) }

            when (currentScreenState) {
                is ScreenState.Splash -> {
                    SplashScreen(
                        navigateToNullNull = { currentScreenState = ScreenState.NullNul }
                    )
                }

                is ScreenState.NullNul -> {
                    NullNullScreen(
                        // TODO navigateToMeatScreen 람다 함수 구현
                    )
                }

                is ScreenState.Store -> {
                    StoreScreen()
                }
            }
        }
    }
}
