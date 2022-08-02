package com.markoid.dojocomposenavigation.home.presentation.di

import com.markoid.dojocomposenavigation.home.data.datasource.HomeDataSource
import com.markoid.dojocomposenavigation.home.data.datasource.HomeDataSourceImpl
import com.markoid.dojocomposenavigation.home.data.service.HomeService
import com.markoid.dojocomposenavigation.home.data.service.HomeServiceImpl
import com.markoid.dojocomposenavigation.home.domain.repository.HomeRepository
import com.markoid.dojocomposenavigation.home.domain.repository.HomeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class HomeModule {

  @Provides
  @Singleton
  fun providesHomeService(
    homeServiceImpl: HomeServiceImpl
  ): HomeService = homeServiceImpl

  @Provides
  @Singleton
  fun providesHomeDataSource(
    homeDataSourceImpl: HomeDataSourceImpl
  ): HomeDataSource = homeDataSourceImpl

  @Provides
  @Singleton
  fun providesHomeRepository(
    homeRepositoryImpl: HomeRepositoryImpl
  ): HomeRepository = homeRepositoryImpl
}