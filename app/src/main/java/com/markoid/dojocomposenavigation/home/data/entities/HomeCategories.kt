package com.markoid.dojocomposenavigation.home.data.entities

import com.google.gson.annotations.SerializedName

data class HomeCategories(
  @SerializedName("category_title")
  private val _categoryTitle: String? = null,

  @SerializedName("items")
  private val _categoryItems: List<CategoryItemEntity>? = null
) {

  val categoryTitle: String
    get() = _categoryTitle ?: ""

  val categoryItems: List<CategoryItemEntity>
    get() = _categoryItems ?: emptyList()
}