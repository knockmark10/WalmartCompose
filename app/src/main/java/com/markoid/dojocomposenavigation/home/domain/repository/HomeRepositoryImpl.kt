package com.markoid.dojocomposenavigation.home.domain.repository

import com.markoid.dojocomposenavigation.commons.entities.DataWrapper
import com.markoid.dojocomposenavigation.home.data.datasource.HomeDataSource
import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories
import javax.inject.Inject

class HomeRepositoryImpl
@Inject constructor(
  private val homeDataSource: HomeDataSource
) : HomeRepository {

  override suspend fun getHomeCategories(): DataWrapper<List<HomeCategories>> =
    homeDataSource.getHomeCategories()
}