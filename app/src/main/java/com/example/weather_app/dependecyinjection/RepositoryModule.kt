package com.example.weather_app.dependecyinjection

import com.example.weather_app.data.remote.repository.WeatherRepositoryImplmation
import com.example.weather_app.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton


@OptIn(ExperimentalCoroutinesApi::class)
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {


    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepositoryImplmation: WeatherRepositoryImplmation):WeatherRepository
}