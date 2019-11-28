package com.zengwei.weather;

import javax.jws.WebService;

@WebService
public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String queryWeather(String cityName) {
        if ("广州".equals(cityName)) {
            return cityName+"天气晴";
        }
        else {
            return cityName+"天气多云";
        }
    }
}
