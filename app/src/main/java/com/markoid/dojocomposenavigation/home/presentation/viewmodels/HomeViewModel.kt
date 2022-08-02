package com.markoid.dojocomposenavigation.home.presentation.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.markoid.dojocomposenavigation.commons.entities.UiState
import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories
import com.markoid.dojocomposenavigation.home.domain.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel
@Inject constructor(
  private val homeRepository: HomeRepository
) : ViewModel() {

  private val _homeCategoriesState: MutableState<UiState<List<HomeCategories>>?> =
    mutableStateOf(null)
  val homeCategoriesState: State<UiState<List<HomeCategories>>?> = _homeCategoriesState

  fun getHomeCategories() = viewModelScope.launch(Dispatchers.IO) {
    _homeCategoriesState.value = UiState.Loading(true)
    val response = homeRepository.getHomeCategories()
    _homeCategoriesState.value = UiState.Loading(false)
    if (response.data != null && response.data?.isNotEmpty() == true) {
      _homeCategoriesState.value = UiState.Success(response.data!!)
    } else {
      _homeCategoriesState.value = UiState.Failure(response.exception!!)
    }
  }
}