package com.AndrewPinner.insight2profittest.services;



import com.AndrewPinner.insight2profittest.model.Coordinates;
import com.AndrewPinner.insight2profittest.model.WeatherDetails;
import com.AndrewPinner.insight2profittest.model.weathermapping.WeatherProperty;
import com.AndrewPinner.insight2profittest.model.weathermapping.WeatherResponse;


public interface GovWeatherAPI {

    Coordinates getCoordinates(String address);

    WeatherResponse getWeather(Coordinates coordinates);

}
