package com.markoid.dojocomposenavigation.home.presentation.enums

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.Icons.Filled
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocalFireDepartment
import com.markoid.dojocomposenavigation.home.presentation.enums.HomeNavRoutes.Account
import com.markoid.dojocomposenavigation.home.presentation.enums.HomeNavRoutes.Departments
import com.markoid.dojocomposenavigation.home.presentation.enums.HomeNavRoutes.Favorites
import com.markoid.dojocomposenavigation.home.presentation.enums.HomeNavRoutes.Home
import com.markoid.dojocomposenavigation.home.presentation.enums.HomeNavRoutes.Lists
import com.markoid.dojocomposenavigation.home.presentation.entities.BottomNavigationItem

object NavBarItems {
  val BarItems = listOf(
    BottomNavigationItem(
      title = "Inicio",
      image = Filled.Home,
      route = Home.route
    ),
    BottomNavigationItem(
      title = "Deptos",
      image = Filled.LocalFireDepartment,
      route = Departments.route
    ),
    BottomNavigationItem(
      title = "Favoritos",
      image = Filled.Favorite,
      route = Favorites.route
    ),
    BottomNavigationItem(
      title = "Listas",
      image = Filled.List,
      route = Lists.route
    ),
    BottomNavigationItem(
      title = "Cuenta",
      image = Filled.AccountCircle,
      route = Account.route
    )
  )
}