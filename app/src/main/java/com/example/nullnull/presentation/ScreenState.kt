package com.example.nullnull.presentation

sealed class ScreenState {
    object Splash : ScreenState()
    object NullNul : ScreenState()
    object Store : ScreenState()
}
