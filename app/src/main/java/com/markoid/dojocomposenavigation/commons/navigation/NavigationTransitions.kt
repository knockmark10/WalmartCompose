package com.markoid.dojocomposenavigation.commons.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally

@OptIn(ExperimentalAnimationApi::class)
val enterTransition = slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = tween(700))

@OptIn(ExperimentalAnimationApi::class)
val exitTransition = slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = tween(700))

@OptIn(ExperimentalAnimationApi::class)
val popEnterTransition = slideInHorizontally(initialOffsetX = { -1000 }, animationSpec = tween(700))

@OptIn(ExperimentalAnimationApi::class)
val popExitTransition = slideOutHorizontally(targetOffsetX = { 1000 }, animationSpec = tween(700))