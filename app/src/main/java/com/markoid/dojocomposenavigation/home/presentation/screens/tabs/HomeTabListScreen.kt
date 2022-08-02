package com.markoid.dojocomposenavigation.home.presentation.screens.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons.Filled
import androidx.compose.material.icons.filled.List
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeTabListScreen() {
  Box(
    modifier = Modifier.fillMaxSize()
  ) {
    Icon(
      imageVector = Filled.List,
      contentDescription = "favorites",
      tint = Color.Green.copy(alpha = 0.6f),
      modifier = Modifier
        .size(150.dp)
        .align(Alignment.Center)
    )
  }
}

@Composable
@Preview(showBackground = true)
fun HomeTabListScreenPreview() {
  HomeTabListScreen()
}