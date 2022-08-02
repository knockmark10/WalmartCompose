package com.markoid.dojocomposenavigation.theme.domain.repository

import androidx.compose.runtime.State
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration

interface ThemeRepository {
  fun setBrandTheme(brand: BrandConfiguration)
  fun getBrandTheme(): State<BrandConfiguration>
}