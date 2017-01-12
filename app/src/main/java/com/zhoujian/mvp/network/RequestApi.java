package com.zhoujian.mvp.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zhoujian on 2017/1/12.
 */

public interface RequestApi
{
    @GET("weather/index")
    Call<ResponseBody> getWeatherData(@Query("cityname") String cityname, @Query("key") String key);
}
