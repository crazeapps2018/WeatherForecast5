package com.it.weatherforecast.utils;

import com.it.weatherforecast.model.Forecast;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface Apis {

    /**
     * By City Name
     */
    @GET("forecast")
    Call<Forecast> getWeatherForecastData(@Query("q") String cityName, @Query("appid") String APIKEY, @Query("units") String TempUnit);

}
