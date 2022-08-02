package com.markoid.dojocomposenavigation.prehome.viewmodels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.EA
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.EXPRESS
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration.OD

class PreHomeViewModel : ViewModel() {

  val brandList = mutableStateListOf(
    OD,
    EA,
    EXPRESS
  )
}