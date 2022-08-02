package com.markoid.dojocomposenavigation.splash.screens

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.markoid.dojocomposenavigation.R
import com.markoid.dojocomposenavigation.commons.theme.WalmartBlue
import kotlinx.coroutines.delay

@Composable
fun SplashScreen() {
  // Creating scale animation value
  val scale = remember { Animatable(initialValue = 0f) }

  // Launching scale animation
  LaunchedEffect(key1 = true) {
    scale.animateTo(
      targetValue = 0.9f,
      animationSpec = tween(
        durationMillis = 800,
        easing = { OvershootInterpolator(8f).getInterpolation(it) }
      )
    )
    // After animation is over, wait for 1 sec
    delay(1_000L)
  }

  // Walmart Logo placed on the center
  Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .fillMaxSize()
      .background(WalmartBlue)
  ) {
    Image(
      painter = painterResource(id = R.drawable.walmart_icon),
      contentDescription = "Splash icon",
      modifier = Modifier.scale(scale.value)
    )
  }
}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview() {
  SplashScreen()
}