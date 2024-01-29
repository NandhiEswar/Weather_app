package com.example.weather_app.data.remote.remote

import com.squareup.moshi.Json

data class Weatherdto(

    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
