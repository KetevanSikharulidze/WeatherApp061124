package com.example.weatherapp061124.models

data class DayItem (
    val city: String,
    val time: String,
    val condition: String,
    val imageURL: String,
    val currentTemp: String,
    val minTemp: String,
    val maxTemp: String,
    val hours : String
)
