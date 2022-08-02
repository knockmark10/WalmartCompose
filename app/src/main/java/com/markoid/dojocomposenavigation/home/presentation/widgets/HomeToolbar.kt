package com.markoid.dojocomposenavigation.home.presentation.widgets

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.markoid.dojocomposenavigation.commons.theme.WalmartBlue

typealias OnNavigationClicked = () -> Unit
typealias OnShoppingCartClicked = () -> Unit

@Composable
fun HomeToolbar(
  onNavigationClicked: OnNavigationClicked = {},
  onShoppingCartClicked: OnShoppingCartClicked = {}
) {
  TopAppBar(
    title = {
      Text(
        text = "Inicio",
        color = Color.White,
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Light
      )
    },
    backgroundColor = MaterialTheme.colors.primary,
    navigationIcon = {
      IconButton(onClick = { onNavigationClicked() }) {
        Icon(
          imageVector = Icons.Default.ArrowBack,
          contentDescription = "Back Arrow",
          tint = Color.White
        )
      }
    },
    actions = {
      IconButton(onClick = { onShoppingCartClicked() }) {
        Icon(
          imageVector = Icons.Default.ShoppingCart,
          contentDescription = "Shopping Cart",
          tint = Color.White
        )
      }
    }
  )
}

@Composable
@Preview(showBackground = true)
fun HomeToolbarPreview() {
  HomeToolbar()
}