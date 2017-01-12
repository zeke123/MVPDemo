package com.zhoujian.mvp.view;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import com.zhoujian.mvp.R;
import com.zhoujian.mvp.model.WeatherData;
import com.zhoujian.mvp.presenter.WeatherPresenter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity implements BaseView
{
    @BindView(R.id.resault)
    TextView mResault;

    @OnClick(R.id.bt_get)
    public void getDatas()
    {
        //获取数据
        initPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);
    }

    private void initPresenter()
    {
        WeatherPresenter presenter = new WeatherPresenter(MainActivity.this);
        presenter.getData("北京", "5c2dd6dd912ba8336889b0325689f809");
    }

    @Override
    public void success(Object object)
    {
        mResault.setText(((WeatherData)object).toString());
    }

    @Override
    public void fail(String s)
    {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}