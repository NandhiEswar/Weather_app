package com.example.weather_app.Weatherdata

data class WeatherInfo(

    //here map in the int means if int is one data will give today if one it was next day
    val weatherDataPerDay:Map<Int,List<weatherData>>,
    //it will give current weather data like hour data show it was
    val currentWeatherData:weatherData?

)
