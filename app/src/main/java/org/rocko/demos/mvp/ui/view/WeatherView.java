package org.rocko.demos.mvp.ui.view;

import org.rocko.demos.mvp.model.entity.Weather;

/**
 * Created by xjp on 2015/6/7.
 */
public interface WeatherView {
    void showLoading();

    void hideLoading();

    void showError();

    void setWeatherInfo(Weather weather);
}
