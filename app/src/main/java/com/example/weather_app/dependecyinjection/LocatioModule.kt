package com.example.weather_app.dependecyinjection

import com.example.weather_app.data.remote.location.DefaultLocationTracker
import com.example.weather_app.domain.location.locationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton


@OptIn(ExperimentalCoroutinesApi::class)
@Module
@InstallIn(SingletonComponent::class)
abstract class LocatioModule {


    @Binds
    @Singleton
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker):locationTracker
}