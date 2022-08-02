package com.markoid.dojocomposenavigation.commons.navigation

import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.markoid.dojocomposenavigation.commons.navigation.NavScreens.Cart
import com.markoid.dojocomposenavigation.commons.navigation.NavScreens.Home
import com.markoid.dojocomposenavigation.commons.navigation.NavScreens.PreHome
import com.markoid.dojocomposenavigation.commons.navigation.NavScreens.Splash

fun NavController.navigate(navScreen: NavScreens) = when (navScreen) {
  PreHome, Splash -> navigate(route = navScreen.name)
  is Home -> navigate(route = "${navScreen.name}/${navScreen.brand}")
  is Cart -> navigate(route = "${navScreen.name}?cartId=${navScreen.cartId},isAnonymous=${navScreen.isAnonymous}")
}