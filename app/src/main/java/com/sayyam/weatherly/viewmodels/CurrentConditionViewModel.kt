package com.sayyam.weatherly.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sayyam.weatherly.model.WeatherResponseDTO
import com.sayyam.weatherly.repository.SearchRepository
import com.sayyam.weatherly.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CurrentConditionViewModel @Inject constructor(private val searchRepository: SearchRepository): ViewModel() {

    private val _weather = MutableLiveData<Resource<WeatherResponseDTO>>()
    val weather: LiveData<Resource<WeatherResponseDTO>> = _weather

}