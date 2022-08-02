package com.markoid.dojocomposenavigation.prehome.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD

typealias OnBrandClicked = (BrandConfiguration) -> Unit

@Composable
fun PreHomeBrandItem(
  brand: BrandConfiguration,
  onBrandClicked: OnBrandClicked = {}
) {
  Card(
    shape = RoundedCornerShape(8.dp),
    elevation = 4.dp,
    modifier = Modifier.clickable { onBrandClicked(brand) }
  ) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally,
      verticalArrangement = Arrangement.Center,
      modifier = Modifier
        .fillMaxWidth()
        .padding(start = 6.dp, end = 6.dp, top = 20.dp, bottom = 20.dp)
    ) {
      Text(
        text = brand.title,
        color = brand.titleColor,
        fontSize = 18.sp,
        fontWeight = FontWeight.SemiBold
      )
      Spacer(modifier = Modifier.height(12.dp))
      Image(
        painter = painterResource(id = brand.image),
        contentDescription = ""
      )
      Spacer(modifier = Modifier.height(12.dp))
      Text(
        text = brand.description,
        color = brand.descriptionColor,
        fontSize = 16.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(start = 48.dp, end = 48.dp)
      )
    }
  }
}

@Composable
@Preview
fun PreHomeBrandItemPreview() {
  PreHomeBrandItem(OD)
}