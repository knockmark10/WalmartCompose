package com.markoid.dojocomposenavigation.home.presentation.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.markoid.dojocomposenavigation.commons.utils.previewNavController
import com.markoid.dojocomposenavigation.home.presentation.widgets.HomeBottomNavigationBar
import com.markoid.dojocomposenavigation.home.presentation.widgets.HomeNavigationHost
import com.markoid.dojocomposenavigation.home.presentation.widgets.HomeToolbar
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD
import com.markoid.dojocomposenavigation.theme.presentation.functions.setBrandTheme
import com.markoid.dojocomposenavigation.theme.presentation.viewmodel.ThemeViewModel

@Composable
fun HomeScreen(
  brand: BrandConfiguration,
  themeViewModel: ThemeViewModel = hiltViewModel()
) {
  setBrandTheme(brand, themeViewModel)
  val bottomNavController = rememberNavController()
  Scaffold(
    topBar = {
      HomeToolbar(
        onNavigationClicked = { },
        onShoppingCartClicked = { }
      )
    },
    content = { HomeNavigationHost(navController = bottomNavController) },
    bottomBar = { HomeBottomNavigationBar(navController = bottomNavController) }
  )
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
  HomeScreen(brand = OD)
}