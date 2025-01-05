package com.ggu.codelabs.basic

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MySootheAppLandscape() {
    Row {
        SootheNavigationRail()
        HomeScreen()
    }
}

@Preview(device = Devices.PIXEL_6)
@Composable
fun MySootheAppLandscapePreview() {
    MySootheAppLandscape()
}