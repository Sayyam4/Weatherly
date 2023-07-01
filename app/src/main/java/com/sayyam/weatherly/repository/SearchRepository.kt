package com.sayyam.weatherly.repository

import com.sayyam.weatherly.model.WeatherResponseDTO
import com.sayyam.weatherly.network.ApiService
import retrofit2.Response
import javax.inject.Inject

class SearchRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getWeather(zipCode:String): Response<WeatherResponseDTO> {
        return apiService.getWeatherDetails(zipCode)
    }

}