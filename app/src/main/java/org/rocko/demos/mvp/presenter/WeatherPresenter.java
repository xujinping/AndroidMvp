package org.rocko.demos.mvp.presenter;

/**
 * Created by xjp on 2015/6/7.
 * 天气 Presenter接口
 */
public interface WeatherPresenter {
    /**
     * 获取天气的逻辑
     */
    void getWeather(String cityNO);

}
