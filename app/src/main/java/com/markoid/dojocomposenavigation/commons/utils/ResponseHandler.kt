package com.markoid.dojocomposenavigation.commons.utils

import com.markoid.dojocomposenavigation.commons.entities.DataWrapper
import retrofit2.Response
import javax.inject.Inject

class ResponseHandler @Inject constructor() {

  fun <T> handleResponse(response: Response<T>): DataWrapper<T> = try {
    if (response.isSuccessful) {
      if (response.body() != null && response.body()?.toString()?.isEmpty() == false) {
        DataWrapper(data = response.body())
      } else {
        DataWrapper(exception = NullPointerException("Empty body"))
      }
    } else {
      DataWrapper(exception = NullPointerException("API Error"))
    }
  } catch (error: Throwable) {
    DataWrapper(exception = error)
  }
}