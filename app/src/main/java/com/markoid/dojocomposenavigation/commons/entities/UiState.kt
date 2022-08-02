package com.markoid.dojocomposenavigation.commons.entities

sealed class UiState<out T> {
  data class Success<T>(val data: T) : UiState<T>()
  data class Loading(val isLoading: Boolean) : UiState<Nothing>()
  data class Failure(val exception: Throwable) : UiState<Nothing>()
}
