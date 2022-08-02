package com.markoid.dojocomposenavigation.home.data.datasource

import com.markoid.dojocomposenavigation.commons.entities.DataWrapper
import com.markoid.dojocomposenavigation.commons.utils.ResponseHandler
import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories
import com.markoid.dojocomposenavigation.home.data.service.HomeService
import kotlinx.coroutines.delay
import javax.inject.Inject

class HomeDataSourceImpl
@Inject constructor(
  private val homeService: HomeService,
  private val responseHandler: ResponseHandler
) : HomeDataSource {

  override suspend fun getHomeCategories(): DataWrapper<List<HomeCategories>> {
    val response = homeService.getHomeCategories()
    delay(2_000L)
    return responseHandler.handleResponse(response)
  }
}