package com.markoid.dojocomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.markoid.dojocomposenavigation.commons.theme.DojoComposeNavigationTheme
import com.markoid.dojocomposenavigation.home.presentation.screens.HomeScreen
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD
import com.markoid.dojocomposenavigation.prehome.screens.PreHomeScreen
import com.markoid.dojocomposenavigation.theme.presentation.viewmodel.ThemeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      WalmartApp()
    }
  }
}

@Composable
fun WalmartApp(themeViewModel: ThemeViewModel = hiltViewModel()) {
  DojoComposeNavigationTheme(currentBrand = themeViewModel.theme) {
    Surface(
      modifier = Modifier.fillMaxSize(),
      color = MaterialTheme.colors.background
    ) {
      Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
      ) {
        // SplashScreen()
        // PreHomeScreen()
        HomeScreen(brand = OD)
        // CartScreen(cartId = "", isAnonymous = true)
      }
    }
  }
}