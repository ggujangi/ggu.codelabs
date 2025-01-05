package com.ggu.codelabs.basic

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MySootheAppPortrait() {
    Scaffold(
        bottomBar = { SootheBottomNavigation() }
    ) { padding ->
        HomeScreen(Modifier.padding(padding))
    }
}

@Preview(device = Devices.PIXEL_6)
@Composable
fun MySootheAppPortraitPreview() {
    MySootheAppPortrait()
}