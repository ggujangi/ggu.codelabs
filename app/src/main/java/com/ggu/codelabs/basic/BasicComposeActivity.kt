package com.ggu.codelabs.basic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.ggu.codelabs.ui.theme.CodeLabsProjectTheme

class BasicComposeActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeLabsProjectTheme {
                val windowSizeClass = calculateWindowSizeClass(this)
                MySootheApp(windowSize = windowSizeClass.widthSizeClass)
            }
        }
    }
}