package com.markoid.dojocomposenavigation.theme.presentation.viewmodel

import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.markoid.dojocomposenavigation.prehome.enums.BrandConfiguration
import com.markoid.dojocomposenavigation.theme.domain.repository.ThemeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ThemeViewModel
@Inject constructor(
  private val themeRepository: ThemeRepository
) : ViewModel() {

  val theme: State<BrandConfiguration> = themeRepository.getBrandTheme()

  fun setTheme(brand: BrandConfiguration) = viewModelScope.launch {
    themeRepository.setBrandTheme(brand)
  }
}