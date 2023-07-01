package com.sayyam.weatherly.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CoordDTO(
    val lat: Double,
    val lon: Double
): Parcelable