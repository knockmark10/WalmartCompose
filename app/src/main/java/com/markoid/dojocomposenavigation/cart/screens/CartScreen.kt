package com.markoid.dojocomposenavigation.cart.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.markoid.dojocomposenavigation.R
import com.markoid.dojocomposenavigation.cart.widgets.CartToolbar
import com.markoid.dojocomposenavigation.commons.theme.WalmartBlue
import com.markoid.dojocomposenavigation.commons.utils.previewNavController

@Composable
fun CartScreen(
  cartId: String,
  isAnonymous: Boolean,
  navController: NavController
) {
  Scaffold(topBar = {
    CartToolbar(onBackPressed = { navController.popBackStack() })
  }) {
    Column(
      modifier = Modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Icon(
        imageVector = Icons.Filled.ShoppingCart,
        contentDescription = "favorites",
        tint = WalmartBlue,
        modifier = Modifier.size(150.dp)
      )
      Spacer(modifier = Modifier.height(20.dp))
      Text(
        text = String.format(stringResource(id = R.string.empty_cart, cartId)),
        fontSize = 14.sp,
        textAlign = TextAlign.Center,
        color = Color.Gray,
        fontFamily = FontFamily.Serif
      )
    }
  }
}

@Composable
@Preview(showBackground = true)
fun CartScreenPreview() {
  CartScreen(
    cartId = "94c123",
    isAnonymous = true,
    navController = previewNavController()
  )
}