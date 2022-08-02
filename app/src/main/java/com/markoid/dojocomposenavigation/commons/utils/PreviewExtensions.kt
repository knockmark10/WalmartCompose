package com.markoid.dojocomposenavigation.commons.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun previewNavController(): NavHostController = NavHostController(LocalContext.current)