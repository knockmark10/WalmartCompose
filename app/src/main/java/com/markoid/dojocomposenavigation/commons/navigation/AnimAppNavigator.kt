package com.markoid.dojocomposenavigation.commons.navigation

// https://proandroiddev.com/safe-compose-arguments-an-improved-way-to-navigate-in-jetpack-compose-95c84722eec2
/*import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.markoid.dojocomposenavigation.cart.screens.CartScreen
import com.markoid.dojocomposenavigation.home.presentation.screens.HomeScreen
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.screens.PreHomeScreen
import com.markoid.dojocomposenavigation.splash.screens.SplashScreen

const val BRAND = "brand"
const val CART_ID = "cartId"
const val IS_ANONYMOUS = "isAnonymous"

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimAppNavigator() {
  val navController = rememberAnimatedNavController()
  AnimatedNavHost(
    navController = navController,
    startDestination = NavScreens.Splash.name
  ) {
    // Splash Screen
    composable(
      route = NavScreens.Splash.name,
      enterTransition = { _, _ -> enterTransition },
      exitTransition = { _, _ -> exitTransition },
      popEnterTransition = { _, _ -> popEnterTransition },
      popExitTransition = { _, _ -> popExitTransition }
    ) {
      SplashScreen(navController = navController)
    }

    // PreHome Screen
    composable(
      route = NavScreens.PreHome.name,
      enterTransition = { _, _ -> enterTransition },
      exitTransition = { _, _ -> exitTransition },
      popEnterTransition = { _, _ -> popEnterTransition },
      popExitTransition = { _, _ -> popExitTransition }
    ) {
      PreHomeScreen(navController = navController)
    }

    // Home Screen
    val homeRoute = NavScreens.Home().name
    composable(
      route = "$homeRoute/{$BRAND}",
      arguments = listOf(navArgument(name = BRAND) { type = NavType.StringType }),
      enterTransition = { _, _ -> enterTransition },
      exitTransition = { _, _ -> exitTransition },
      popEnterTransition = { _, _ -> popEnterTransition },
      popExitTransition = { _, _ -> popExitTransition }
    ) { navBackStack ->
      val brand = navBackStack.arguments?.getString("brand").orEmpty()
      HomeScreen(brand = BrandConfiguration.valueOf(brand), navController = navController)
    }

    // Cart Screen
    val cartRoute = NavScreens.Home().name
    composable(
      route = "$cartRoute?$CART_ID={$CART_ID},$IS_ANONYMOUS={$IS_ANONYMOUS}",
      arguments = listOf(navArgument(name = BRAND) { type = NavType.StringType }),
      enterTransition = { _, _ -> enterTransition },
      exitTransition = { _, _ -> exitTransition },
      popEnterTransition = { _, _ -> popEnterTransition },
      popExitTransition = { _, _ -> popExitTransition }
    ) { navBackStack ->
      CartScreen(
        cartId = navBackStack.arguments?.getString("cartId") ?: "",
        isAnonymous = navBackStack.arguments?.getBoolean("isAnonymous") ?: false,
        navController = navController
      )
    }
  }
}

@OptIn(ExperimentalAnimationApi::class)
val enterTransition = slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = tween(700))

@OptIn(ExperimentalAnimationApi::class)
val exitTransition = slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = tween(700))

@OptIn(ExperimentalAnimationApi::class)
val popEnterTransition = slideInHorizontally(initialOffsetX = { -1000 }, animationSpec = tween(700))

@OptIn(ExperimentalAnimationApi::class)
val popExitTransition = slideOutHorizontally(targetOffsetX = { 1000 }, animationSpec = tween(700))*/





/*
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
}*/
