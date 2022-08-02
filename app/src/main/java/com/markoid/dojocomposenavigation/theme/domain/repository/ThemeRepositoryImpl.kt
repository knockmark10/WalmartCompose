package com.markoid.dojocomposenavigation.theme.domain.repository

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD

object ThemeRepositoryImpl : ThemeRepository {

  var currentTheme = mutableStateOf(OD)

  override fun setBrandTheme(brand: BrandConfiguration) {
    currentTheme.value = brand
  }

  override fun getBrandTheme(): State<BrandConfiguration> = currentTheme
}