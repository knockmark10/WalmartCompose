package com.markoid.dojocomposenavigation.home.data.entities

import com.google.gson.annotations.SerializedName

data class CategoryItemEntity(
  @SerializedName("image_url")
  val imageUrl: String,

  @SerializedName("name")
  val title: String,

  @SerializedName("price")
  val price: Double
)
