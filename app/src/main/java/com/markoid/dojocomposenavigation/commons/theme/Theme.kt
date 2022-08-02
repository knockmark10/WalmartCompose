package com.markoid.dojocomposenavigation.commons.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.EA
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.EXPRESS
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD

private val DarkColorPalette = darkColors(
  primary = Purple200,
  primaryVariant = Purple700,
  secondary = Teal200
)

private val LightColorPalette = lightColors(
  primary = WalmartBlue,
  primaryVariant = WalmartDarkBlue,
  secondary = WalmartAccent

  /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

private val EaLightColorPalette = lightColors(
  primary = EaPreHomeTitle,
  primaryVariant = EaPreHomeDescription,
  secondary = Color.DarkGray
)

private val ExpressLightColorPalette = lightColors(
  primary = XpPreHomeTitle,
  primaryVariant = XpPreHomeDescription,
  secondary = Color.Green
)

@Composable
fun DojoComposeNavigationTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  currentBrand: State<BrandConfiguration> = mutableStateOf(OD),
  content: @Composable () -> Unit
) {
  val colors = if (darkTheme) {
    DarkColorPalette
  } else when (currentBrand.value) {
    OD -> LightColorPalette
    EXPRESS -> ExpressLightColorPalette
    EA -> EaLightColorPalette
  }

  MaterialTheme(
    colors = colors,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}