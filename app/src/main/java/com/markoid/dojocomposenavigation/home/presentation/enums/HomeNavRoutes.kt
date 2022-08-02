package com.markoid.dojocomposenavigation.home.presentation.enums

sealed class HomeNavRoutes(val route: String) {
  object Home: HomeNavRoutes("Inicio")
  object Departments: HomeNavRoutes("Departamentos")
  object Favorites: HomeNavRoutes("Favoritos")
  object Lists: HomeNavRoutes("Listas")
  object Account: HomeNavRoutes("Cuenta")
}