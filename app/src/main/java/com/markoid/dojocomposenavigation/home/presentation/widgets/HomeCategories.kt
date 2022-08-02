package com.markoid.dojocomposenavigation.home.presentation.widgets

import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.markoid.dojocomposenavigation.home.data.entities.CategoryItemEntity

@Composable
fun HomeCategories(
  title: String,
  items: List<CategoryItemEntity>
) {
  Column(modifier = Modifier.fillMaxWidth()) {
    Text(
      text = title,
      style = MaterialTheme.typography.h6,
      fontWeight = FontWeight.Bold,
      fontFamily = FontFamily.Serif,
      modifier = Modifier.padding(start = 15.dp)
    )
    Spacer(modifier = Modifier.height(12.dp))
    LazyRow(
      horizontalArrangement = spacedBy(15.dp),
      modifier = Modifier.padding(start = 15.dp)
    ) {
      items(items) { item ->
        HomeCategoryItemCard(item = item)
      }
    }
  }
}

@Composable
@Preview(showBackground = true)
fun HomeCategoriesPreview() {
  HomeCategories(
    title = "Los mejores precios en cervezas",
    items = emptyList()
  )
}