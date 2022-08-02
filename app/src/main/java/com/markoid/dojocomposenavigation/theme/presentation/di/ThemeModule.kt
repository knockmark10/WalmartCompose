package com.markoid.dojocomposenavigation.theme.presentation.di

import com.markoid.dojocomposenavigation.theme.domain.repository.ThemeRepository
import com.markoid.dojocomposenavigation.theme.domain.repository.ThemeRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ThemeModule {

  @Singleton
  @Provides
  fun provideThemeRepository(): ThemeRepository = ThemeRepositoryImpl
}