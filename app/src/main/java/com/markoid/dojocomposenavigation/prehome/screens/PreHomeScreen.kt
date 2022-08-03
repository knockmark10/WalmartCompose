package com.markoid.dojocomposenavigation.prehome.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.markoid.dojocomposenavigation.R.drawable
import com.markoid.dojocomposenavigation.R.string
import com.markoid.dojocomposenavigation.commons.navigation.NavScreens
import com.markoid.dojocomposenavigation.commons.navigation.navigate
import com.markoid.dojocomposenavigation.commons.theme.PreHomeGreyLight
import com.markoid.dojocomposenavigation.commons.utils.previewNavController
import com.markoid.dojocomposenavigation.prehome.viewmodels.PreHomeViewModel
import com.markoid.dojocomposenavigation.prehome.widgets.PreHomeListOfBrands

@Composable
fun PreHomeScreen(
  navController: NavController,
  preHomeViewModel: PreHomeViewModel = viewModel()
) {
  val systemUiController = rememberSystemUiController()
  systemUiController.setSystemBarsColor(color = PreHomeGreyLight)
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .fillMaxSize()
      .background(Color.Gray.copy(0.1f))
      .padding(16.dp)
  ) {
    Image(
      painter = painterResource(id = drawable.walmart_icon),
      contentDescription = "Walmart Icon",
      modifier = Modifier.size(50.dp)
    )
    Spacer(modifier = Modifier.height(40.dp))
    Text(
      text = stringResource(id = string.pre_home_title),
      fontSize = 20.sp,
      fontWeight = FontWeight.Bold,
      color = PreHomeGreyLight,
      fontFamily = FontFamily.SansSerif
    )
    Spacer(modifier = Modifier.height(40.dp))
    PreHomeListOfBrands(
      brands = preHomeViewModel.brandList,
      onBrandClicked = { navController.navigate(NavScreens.Home(it)) }
    )
  }
}

@Composable
@Preview(showBackground = true)
fun PreHomeScreenPreview() {
  PreHomeScreen(navController = previewNavController())
}
