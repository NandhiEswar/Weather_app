package com.example.weather_app.Preseation

import com.example.weather_app.Weatherdata.WeatherInfo
import java.lang.Error

data class WeatherState(
    val weatherInfo: WeatherInfo?=null,
    val isLoader: Boolean = false,
    val error: String? = null
) {

}