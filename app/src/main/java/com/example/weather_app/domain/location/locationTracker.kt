package com.example.weather_app.domain.location

import android.location.Location

interface locationTracker {

    suspend fun getCurrentLocation():Location?
}