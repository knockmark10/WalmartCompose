package com.markoid.dojocomposenavigation.home.presentation.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.markoid.dojocomposenavigation.R
import com.markoid.dojocomposenavigation.commons.theme.WalmartBlue

@Composable
fun HomeSearch(searchValueState: MutableState<String>) {
  Column(
    modifier = Modifier
      .fillMaxWidth()
      .height(80.dp)
      .background(MaterialTheme.colors.primary),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    TextField(
      value = searchValueState.value,
      onValueChange = { searchValueState.value = it },
      modifier = Modifier
        .fillMaxWidth(0.95f)
        .background(Color.White),
      leadingIcon = {
        Icon(
          imageVector = Icons.Default.Search,
          contentDescription = "Search icon"
        )
      },
      shape = RoundedCornerShape(6.dp),
      colors = TextFieldDefaults.outlinedTextFieldColors(
        focusedBorderColor = Color.White,
        unfocusedBorderColor = Color.White
      ),
      placeholder = {
        Text(
          text = stringResource(id = R.string.search_hint),
          fontWeight = FontWeight.Light,
          color = Color.Gray,
          fontFamily = FontFamily.Serif
        )
      }
    )
  }
}

@Composable
@Preview(showBackground = true)
fun HomeSearchPreview() {
  val previewState = remember { mutableStateOf("") }
  HomeSearch(searchValueState = previewState)
}