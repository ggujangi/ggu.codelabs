package com.ggu.codelabs.basic

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ggu.codelabs.R

@Composable
fun SootheNavigationRail(
    modifier: Modifier = Modifier
) {
    NavigationRail(
        modifier = modifier.padding(vertical = 8.dp),
        containerColor = MaterialTheme.colorScheme.background,
    ) {
        NavigationRailItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            },
            label = {
                Text(stringResource(id = R.string.basic_compose_bottom_navigation_home))
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        NavigationRailItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
            },
            label = {
                Text(stringResource(id = R.string.basic_compose_bottom_navigation_profile))
            }
        )
    }
}

@Preview(device = Devices.PIXEL_6)
@Composable
fun SootheNavigationRailPreview() {
    SootheNavigationRail()
}