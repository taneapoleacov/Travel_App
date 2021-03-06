package com.example.travelapp.netwoking
import com.example.travelapp.netwoking.WeatherResponse

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {
    @GET("data/2.5/weather?")
    fun getCurrentWeatherData(@Query("lat") lat: String, @Query("lon") lon: String, @Query("APPID") appid: String): Call<WeatherResponse>
}