package com.example.weatherapp061124

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weatherapp061124.models.WeatherItem

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherItem>()
    val liveDataList = MutableLiveData<List<WeatherItem>>()
}