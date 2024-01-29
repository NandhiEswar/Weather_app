package com.example.weather_app.data.remote.repository

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.weather_app.Util.Util
import com.example.weather_app.Weatherdata.WeatherInfo
import com.example.weather_app.data.remote.mappers.toWeatherInfo
import com.example.weather_app.data.remote.remote.Weatherapi
import com.example.weather_app.domain.repository.WeatherRepository
import javax.inject.Inject

class WeatherRepositoryImplmation @Inject constructor(private val api:Weatherapi):WeatherRepository {


    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getweatherdata(lat: Double, lon: Double):Util<WeatherInfo> {

        return try {
            Util.Success(
                data = api.getweatherData(
                    lat =lat ,
                    long = lon
                ).toWeatherInfo()
            )
        }catch (e:Exception){
            e.printStackTrace()
            Util.Error(e.message ?:"An unknown error occurred.")
        }
    }

}