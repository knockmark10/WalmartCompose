package com.markoid.dojocomposenavigation.cart.widgets

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

typealias OnBackPressed = () -> Unit

@Composable
fun CartToolbar(
  onBackPressed: OnBackPressed = {},
) {
  TopAppBar(
    title = {
      Text(
        text = "Carrito",
        color = Color.White,
        fontFamily = FontFamily.Serif,
        fontWeight = FontWeight.Light
      )
    },
    navigationIcon = {
      IconButton(onClick = { onBackPressed() }) {
        Icon(
          imageVector = Icons.Default.ArrowBack,
          contentDescription = "Back Arrow",
          tint = Color.White
        )
      }
    },
    backgroundColor = MaterialTheme.colors.primary
  )
}

@Composable
@Preview(showBackground = true)
fun HomeToolbarPreview() {
  CartToolbar()
}