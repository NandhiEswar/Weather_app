package com.example.weather_app

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weather_app.Preseation.WeatherState
import com.example.weather_app.domain.location.locationTracker
import com.example.weather_app.domain.repository.WeatherRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class WeatherViewModel @Inject constructor(private val repository: WeatherRepository,
    private val locationTracker: locationTracker):ViewModel() {

        var state by mutableStateOf(WeatherState())
    private set

    fun loadweatherInfo(){
        viewModelScope.launch { {
            state = state.copy(
                isLoader = true,
                error = null

            )
        } }
    }
}