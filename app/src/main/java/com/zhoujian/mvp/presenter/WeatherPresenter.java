package com.zhoujian.mvp.presenter;

import com.google.gson.Gson;
import com.zhoujian.mvp.model.WeatherData;
import com.zhoujian.mvp.network.RequestApi;
import com.zhoujian.mvp.network.RetrofitComentUtil;
import com.zhoujian.mvp.view.BaseView;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by zhoujian on 2017/1/12.
 */

public class WeatherPresenter
{
    private BaseView mBaseView;
    private RequestApi mRequestApi;
    private Call<ResponseBody> call;

    public WeatherPresenter(BaseView mBaseView)
    {
        this.mBaseView= mBaseView;
    }

    public void getData(String cityname, String key)
    {
        mRequestApi = RetrofitComentUtil.createService(RequestApi.class);
        call = mRequestApi.getWeatherData(cityname, key);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response)
            {
                try
                {
                    Gson gson = new Gson();
                    WeatherData mWeatherData = gson.fromJson(response.body().string(), WeatherData.class);
                    mBaseView.success(mWeatherData);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    mBaseView.fail("请求数据失败");
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t)
            {
                mBaseView.fail("请求数据失败");
            }
        });
    }
}
