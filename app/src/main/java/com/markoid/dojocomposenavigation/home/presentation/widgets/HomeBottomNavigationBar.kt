package com.markoid.dojocomposenavigation.home.presentation.widgets

import androidx.compose.foundation.background
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.markoid.dojocomposenavigation.home.presentation.enums.NavBarItems
import com.markoid.dojocomposenavigation.commons.theme.WalmartBlue

@Composable
fun HomeBottomNavigationBar(
  navController: NavHostController = NavHostController(LocalContext.current)
) {
  BottomNavigation {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    NavBarItems.BarItems.forEach { navItem ->
      BottomNavigationItem(
        modifier = Modifier.background(Color.White),
        selected = currentRoute == navItem.route,
        onClick = {
          navController.navigate(navItem.route) {
            popUpTo(navController.graph.findStartDestination().id) {
              saveState = true
            }
            launchSingleTop = true
            restoreState = true
          }
        },
        selectedContentColor = MaterialTheme.colors.primary,
        unselectedContentColor = Color.Gray,
        icon = {
          Icon(
            imageVector = navItem.image,
            contentDescription = navItem.title
          )
        },
        label = {
          Text(
            text = navItem.title,
            color = Color.Black,
            fontSize = 12.sp,
            fontWeight = FontWeight.Light
          )
        },
      )
    }
  }
}

@Composable
@Preview(showBackground = true)
fun HomeBottomNavigationBarPreview() {
  HomeBottomNavigationBar()
}