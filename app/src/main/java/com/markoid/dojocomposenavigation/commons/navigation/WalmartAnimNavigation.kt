package com.markoid.dojocomposenavigation.commons.navigation

// https://proandroiddev.com/safe-compose-arguments-an-improved-way-to-navigate-in-jetpack-compose-95c84722eec2
import androidx.compose.animation.ExperimentalAnimationApi
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
fun WalmartAnimNavigation() {
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
      HomeScreen(
        brand = BrandConfiguration.valueOf(brand),
        navController = navController
      )
    }

    // Cart Screen
    val cartRoute = NavScreens.Cart().name
    composable(
      route = "$cartRoute?$CART_ID={$CART_ID},$IS_ANONYMOUS={$IS_ANONYMOUS}",
      arguments = listOf(
        navArgument(name = CART_ID) { type = NavType.StringType },
        navArgument(name = IS_ANONYMOUS) { type = NavType.BoolType }
      ),
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