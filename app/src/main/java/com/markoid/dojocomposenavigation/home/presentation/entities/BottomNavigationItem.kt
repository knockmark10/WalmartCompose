package com.markoid.dojocomposenavigation.home.presentation.entities

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
  val title: String,
  val image: ImageVector,
  val route: String
)