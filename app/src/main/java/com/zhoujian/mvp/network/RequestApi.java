package com.zhoujian.mvp.network;

import com.zhoujian.mvp.model.WeatherData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Created by zhoujian on 2017/1/12.
 */

public interface RequestApi
{
    @Headers({
            "Accept: application/vnd.yourapi.v1.full+json",
            "User-Agent: zhoujian_retrofit"})

    @GET("weather/index")
    Call<WeatherData> getWeatherData(@Query("cityname") String cityname, @Query("key") String key);




   /* @GET("weather/index")
    Call<WeatherData> getWeatherData(@Header("Accept") String Accept,
                                     @Header("User-Agent") String zhoujian_retrofit,
                                     @Query("cityname") String cityname, @Query("key") String key);*/
}
