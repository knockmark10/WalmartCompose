package com.markoid.dojocomposenavigation.prehome.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD

@Composable
fun PreHomeListOfBrands(
  brands: List<BrandConfiguration>,
  onBrandClicked: OnBrandClicked = {}
) {
  LazyColumn(
    contentPadding = PaddingValues(6.dp),
    verticalArrangement = Arrangement.spacedBy(32.dp)
  ) {
    items(brands) { brand ->
      PreHomeBrandItem(
        brand = brand,
        onBrandClicked = onBrandClicked
      )
    }
  }
}

@Composable
@Preview(showBackground = true)
fun PreHomeListOfBrandsPreview() {
  PreHomeListOfBrands(listOf(OD))
}