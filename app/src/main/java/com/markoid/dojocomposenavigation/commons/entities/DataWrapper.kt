package com.markoid.dojocomposenavigation.commons.entities

data class DataWrapper<T>(
  var data: T? = null,
  var exception: Throwable? = null
)