package com.markoid.dojocomposenavigation.home.presentation.screens.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HomeTabFavoritesScreen() {
  Box(
    modifier = Modifier.fillMaxSize()
  ) {
    Icon(
      imageVector = Icons.Filled.Favorite,
      contentDescription = "favorites",
      tint = Color.Red,
      modifier = Modifier
        .size(150.dp)
        .align(Alignment.Center)
    )
  }
}

@Composable
@Preview(showBackground = true)
fun HomeTabFavoritesScreenPreview() {
  HomeTabFavoritesScreen()
}