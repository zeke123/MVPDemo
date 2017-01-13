package com.zhoujian.mvp.presenter;

import android.util.Log;

import com.zhoujian.mvp.model.WeatherData;
import com.zhoujian.mvp.network.RequestApi;
import com.zhoujian.mvp.network.RetrofitComentUtil;
import com.zhoujian.mvp.view.BaseView;

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
    private Call<WeatherData> call;

    public WeatherPresenter(BaseView mBaseView)
    {
        this.mBaseView= mBaseView;
    }

    public void getData(String cityname, String key)
    {
        mRequestApi = RetrofitComentUtil.createService(RequestApi.class);
        call = mRequestApi.getWeatherData(cityname, key);
        call.enqueue(new Callback<WeatherData>() {

            private String mString;

            @Override
            public void onResponse(Call<WeatherData> call, Response<WeatherData> response)
            {
                try
                {

                    mString = response.body().toString();


                    Log.i("okhttp","返回数据==="+mString);



                    mBaseView.success(mString);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    mBaseView.fail("请求数据失败");
                }
            }
            @Override
            public void onFailure(Call<WeatherData> call, Throwable t)
            {
                mBaseView.fail("请求数据失败");
            }
        });
    }
}
