package com.markoid.dojocomposenavigation.home.domain.repository

import com.markoid.dojocomposenavigation.commons.entities.DataWrapper
import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories

interface HomeRepository {
  suspend fun getHomeCategories(): DataWrapper<List<HomeCategories>>
}