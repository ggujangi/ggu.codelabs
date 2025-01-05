package com.ggu.codelabs.basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ggu.codelabs.R

@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        repeat(10) {
            item {
                AlignYourBodyElement(
                    drawable = R.drawable.test,
                    text = R.string.basic_compose_item_title,
                )
            }
        }
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL_6)
@Composable
fun AlignYourBodyRowPreview() {
    AlignYourBodyRow()
}