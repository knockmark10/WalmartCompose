package com.markoid.dojocomposenavigation.home.data.service

import com.markoid.dojocomposenavigation.home.data.entities.HomeCategories
import retrofit2.Response

interface HomeService {
  suspend fun getHomeCategories(): Response<List<HomeCategories>>
}