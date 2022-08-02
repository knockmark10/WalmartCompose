package com.markoid.dojocomposenavigation.home.presentation.widgets

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.markoid.dojocomposenavigation.home.presentation.enums.HomeNavRoutes
import com.markoid.dojocomposenavigation.home.presentation.screens.tabs.HomeTab
import com.markoid.dojocomposenavigation.home.presentation.screens.tabs.HomeTabAccountScreen
import com.markoid.dojocomposenavigation.home.presentation.screens.tabs.HomeTabDepartmentsScreen
import com.markoid.dojocomposenavigation.home.presentation.screens.tabs.HomeTabFavoritesScreen
import com.markoid.dojocomposenavigation.home.presentation.screens.tabs.HomeTabListScreen

@Composable
fun HomeNavigationHost(navController: NavHostController) {
  NavHost(
    navController = navController,
    startDestination = HomeNavRoutes.Home.route,
  ) {
    composable(HomeNavRoutes.Home.route) {
      HomeTab()
    }

    composable(HomeNavRoutes.Departments.route) {
      HomeTabDepartmentsScreen()
    }

    composable(HomeNavRoutes.Favorites.route) {
      HomeTabFavoritesScreen()
    }

    composable(HomeNavRoutes.Lists.route) {
      HomeTabListScreen()
    }

    composable(HomeNavRoutes.Account.route) {
      HomeTabAccountScreen()
    }
  }
}

@Composable
fun HomeNavigationHostPreview() {
  HomeNavigationHost(navController = NavHostController(LocalContext.current))
}