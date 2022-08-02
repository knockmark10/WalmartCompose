package com.markoid.dojocomposenavigation.home.presentation.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.markoid.dojocomposenavigation.commons.theme.WalmartBlue
import com.markoid.dojocomposenavigation.home.data.entities.CategoryItemEntity

typealias OnItemClicked = (CategoryItemEntity) -> Unit

@Composable
fun HomeCategoryItemCard(
  item: CategoryItemEntity,
  onItemClicked: OnItemClicked = {}
) {
  Surface(
    shape = RoundedCornerShape(4.dp),
    border = BorderStroke(1.dp, Color.LightGray),
    modifier = Modifier
      .background(Color.White)
      .clickable { onItemClicked(item) }
  ) {
    Column(
      modifier = Modifier
        .padding(6.dp)
        .width(120.dp)
    ) {
      Box(modifier = Modifier.width(120.dp)) {
        IconButton(
          onClick = {},
          modifier = Modifier.align(Alignment.TopEnd),
        ) {
          Icon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "",
            tint = Color.LightGray
          )
        }
        Image(
          painter = rememberImagePainter(data = item.imageUrl),
          contentDescription = "Item image",
          modifier = Modifier
            .height(150.dp)
            .width(60.dp)
            .align(Alignment.TopCenter)
        )
      }
      Text(
        text = item.title,
        style = MaterialTheme.typography.caption,
        fontSize = 14.sp,
        fontWeight = FontWeight.Light
      )
      Spacer(modifier = Modifier.height(6.dp))
      Text(
        text = String.format("$%.2f", item.price),
        style = MaterialTheme.typography.caption,
        fontSize = 14.sp,
        fontWeight = Companion.Bold
      )
      Spacer(modifier = Modifier.height(60.dp))
      Button(
        onClick = { /*TODO*/ },
        border = BorderStroke(1.dp, WalmartBlue),
        modifier = Modifier
          .fillMaxWidth(0.9f)
          .height(40.dp)
          .align(CenterHorizontally),
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.buttonColors(
          backgroundColor = Color.White
        )
      ) {
        Text(
          text = "Agregar",
          style = MaterialTheme.typography.caption,
          color = WalmartBlue,
          fontWeight = Companion.Bold,
          fontSize = 14.sp
        )
      }
      Spacer(modifier = Modifier.height(20.dp))
    }
  }
}

@Composable
@Preview(showBackground = true)
fun HomeCategoryItemCardPreview() {
  HomeCategoryItemCard(
    CategoryItemEntity(
      imageUrl = "",
      title = "Cerveza oscura Victoria 12 botellas",
      price = 150.0
    )
  )
}