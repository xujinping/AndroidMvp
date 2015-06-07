package org.rocko.demos.mvp.model;

import org.rocko.demos.mvp.presenter.OnWeatherListener;

/**
 * Created by xjp 2015-6-7
 * 天气Model接口
 */
public interface WeatherModel {
    void loadWeather(String cityNO, OnWeatherListener listener);
}
