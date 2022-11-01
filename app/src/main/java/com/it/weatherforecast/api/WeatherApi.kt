package com.it.weatherforecast.api

import com.it.weatherforecast.model.Forecast
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

  /*  @GET("forecast")
     suspend fun getWeather(
        @Query("lat") lat: Double ,
        @Query("lon") lon: Double,
        @Query("appid") appid: String
     ) : Response<WeatherResponse>*/

    /**
     * By City Name
     */
    @GET("forecast")
    fun getWeatherForecastData(
        @Query("q") cityName: StringBuilder?,
        @Query("APPID") APIKEY: String?,
        @Query("units") TempUnit: String?
    ): Call<Forecast?>?

}