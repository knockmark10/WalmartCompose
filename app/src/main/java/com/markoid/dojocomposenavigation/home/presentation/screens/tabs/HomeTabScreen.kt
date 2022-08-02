package com.markoid.dojocomposenavigation.home.presentation.screens.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.markoid.dojocomposenavigation.commons.entities.UiState.Failure
import com.markoid.dojocomposenavigation.commons.entities.UiState.Loading
import com.markoid.dojocomposenavigation.commons.entities.UiState.Success
import com.markoid.dojocomposenavigation.home.presentation.viewmodels.HomeViewModel
import com.markoid.dojocomposenavigation.home.presentation.widgets.HomeContent
import com.markoid.dojocomposenavigation.home.presentation.widgets.HomeError
import com.markoid.dojocomposenavigation.home.presentation.widgets.HomeLoading
import com.markoid.dojocomposenavigation.home.presentation.widgets.HomeSearch

@Composable
fun HomeTab(viewModel: HomeViewModel = hiltViewModel()) {
  LaunchedEffect(key1 = true) { viewModel.getHomeCategories() }

  val searchValueState = remember { mutableStateOf("") }

  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(Color.Gray.copy(0.1f))
      .verticalScroll(rememberScrollState())
  ) {
    HomeSearch(searchValueState = searchValueState)
    Spacer(modifier = Modifier.height(20.dp))

    when (val result = viewModel.homeCategoriesState.value) {
      is Failure -> HomeError(result.exception.localizedMessage.orEmpty())
      is Loading -> HomeLoading()
      is Success -> HomeContent(result.data)
    }
  }
}

@Composable
@Preview(showBackground = true)
fun HomeTabPreview() {
  HomeTab()
}