package com.zengwei.weather;

import javax.jws.WebMethod;
import javax.jws.WebService;


public interface WeatherInterface {

    public String queryWeather(String cityName);


}
