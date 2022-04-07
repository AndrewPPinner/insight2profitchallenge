package com.AndrewPinner.insight2profittest.services;


import com.AndrewPinner.insight2profittest.model.AndrewWeatherDetails;

public interface AndrewWeatherAPI {

    AndrewWeatherDetails[] getWeather(String location);
}
