package com.sayyam.weatherly.repository

import com.sayyam.weatherly.model.forecast.ForecastDTO
import com.sayyam.weatherly.network.ApiService
import retrofit2.Response
import javax.inject.Inject

class ForecastRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getSixteenDaysForecast(lat:Double,long:Double): Response<ForecastDTO> {
        return apiService.getSixteenDaysForecast(lat, long)
    }

}