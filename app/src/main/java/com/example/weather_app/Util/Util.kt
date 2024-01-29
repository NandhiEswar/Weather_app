package com.example.weather_app.Util

sealed class Util<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?): Util<T>(data)
    class Error<T>(message: String, data: T? = null): Util<T>(data, message)
}