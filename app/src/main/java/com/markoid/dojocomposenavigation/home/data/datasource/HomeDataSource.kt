package com.markoid.dojocomposenavigation.home.data.datasource

import com.markoid.dojocomposenavigation.commons.entities.DataWrapper
import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories

interface HomeDataSource {
  suspend fun getHomeCategories(): DataWrapper<List<HomeCategories>>
}