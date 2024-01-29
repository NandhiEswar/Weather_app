package com.example.weather_app.Weatherdata

import java.time.LocalDateTime

data class weatherData(
    //local data it get the data particular date and time
    val time:LocalDateTime,

    val temperatureCelusius:Double,

    val pressure:Double,
    val windSpeed:Double,
    val humidity:Double,
    val weatherType:weather_response
)
