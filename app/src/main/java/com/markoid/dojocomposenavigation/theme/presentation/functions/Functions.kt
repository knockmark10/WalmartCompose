package com.markoid.dojocomposenavigation.theme.presentation.functions

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.theme.presentation.viewmodel.ThemeViewModel

@Composable
fun setBrandTheme(
  brand: BrandConfiguration,
  themeViewModel: ThemeViewModel
): BrandConfiguration {
  themeViewModel.setTheme(brand)
  val systemUiController = rememberSystemUiController()
  systemUiController.setSystemBarsColor(color = MaterialTheme.colors.primary)
  return brand
}