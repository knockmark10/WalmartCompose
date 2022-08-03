package com.markoid.dojocomposenavigation.commons.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.markoid.dojocomposenavigation.cart.screens.CartScreen
import com.markoid.dojocomposenavigation.home.presentation.screens.HomeScreen
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.screens.PreHomeScreen
import com.markoid.dojocomposenavigation.splash.screens.SplashScreen

@Composable
fun WalmartNavigation() {
  val navController = rememberNavController()
  NavHost(
    navController = navController,
    startDestination = NavScreens.Splash.name
  ) {
    // Splash
    composable(route = NavScreens.Splash.name) {
      SplashScreen(navController = navController)
    }
    // PreHome
    composable(route = NavScreens.PreHome.name) {
      PreHomeScreen(navController = navController)
    }
    // Home
    val homeRoute = NavScreens.Home().name
    composable(
      route = "$homeRoute/{brand}",
      arguments = listOf(navArgument(name = "brand") { type = NavType.StringType })
    ) {
      val brand = BrandConfiguration
        .valueOf(it.arguments?.getString("brand").orEmpty())
      HomeScreen(brand = brand, navController = navController)
    }
    // Cart
    val cartRoute = NavScreens.Cart().name
    composable(
      route = "$cartRoute?cartId={cartId},isAnonymous={isAnonymous}",
      arguments = listOf(
        navArgument(name = "cartId") { type = NavType.StringType },
        navArgument(name = "isAnonymous") { type = NavType.BoolType }
      )
    ) {
      CartScreen(
        cartId = it.arguments?.getString("cartId") ?: "",
        isAnonymous = it.arguments?.getBoolean("isAnonymous") ?: false,
        navController = navController
      )
    }
  }
}