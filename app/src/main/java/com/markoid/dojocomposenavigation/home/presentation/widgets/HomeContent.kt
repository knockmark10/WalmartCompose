package com.markoid.dojocomposenavigation.home.presentation.widgets

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories

@Composable
fun HomeContent(categories: List<HomeCategories>) {
  categories.forEach {
    HomeCategories(title = it.categoryTitle, items = it.categoryItems)
    Spacer(modifier = Modifier.height(20.dp))
  }
  Spacer(modifier = Modifier.height(80.dp))
}