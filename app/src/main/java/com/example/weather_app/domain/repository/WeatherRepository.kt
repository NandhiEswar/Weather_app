package com.example.weather_app.domain.repository

import com.example.weather_app.Util.Util
import com.example.weather_app.Weatherdata.WeatherInfo

interface WeatherRepository {

    suspend fun  getweatherdata(lat:Double, lon:Double): Util<WeatherInfo>

}