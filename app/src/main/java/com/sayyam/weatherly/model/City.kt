package com.sayyam.weatherly.model

import com.sayyam.weatherly.model.forecast.Coord

data class City(
    val coord: Coord,
    val country: String,
    val id: Int,
    val name: String,
    val population: Int,
    val timezone: Int
)