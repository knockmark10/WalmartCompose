package com.markoid.dojocomposenavigation.commons.navigation

import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD

sealed class NavScreens(val name: String) {
  object Splash : NavScreens("Splash")
  object PreHome : NavScreens("PreHome")
  data class Home(val brand: BrandConfiguration = OD) : NavScreens("Home")
  data class Cart(
    val cartId: String = "",
    val isAnonymous: Boolean = true
  ) : NavScreens("Cart")
}

