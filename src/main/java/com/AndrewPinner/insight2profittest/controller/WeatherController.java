package com.AndrewPinner.insight2profittest.controller;


import com.AndrewPinner.insight2profittest.model.*;
import com.AndrewPinner.insight2profittest.model.weathermapping.WeatherResponse;
import com.AndrewPinner.insight2profittest.services.AndrewWeatherAPI;
import com.AndrewPinner.insight2profittest.services.GovWeatherAPI;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class WeatherController {
    private GovWeatherAPI govWeatherAPI;
    private AndrewWeatherAPI andrewWeatherAPI;


    public WeatherController(GovWeatherAPI govWeatherAPI, AndrewWeatherAPI andrewWeatherAPI) {
        this.govWeatherAPI = govWeatherAPI;
        this.andrewWeatherAPI = andrewWeatherAPI;
    }


//get request for base weather endpoint using Geocoding service and National Weather API
    @GetMapping("/weather")
    public WeatherResponse getWeatherGovAPI(@RequestParam(value = "address") String address) {
        Coordinates coordinates = govWeatherAPI.getCoordinates(address);
        WeatherResponse weatherResponse = govWeatherAPI.getWeather(coordinates);
        return weatherResponse;
    }

//get request endpoint for self built weather API
    @GetMapping("/weather/extra")
    public AndrewWeatherDetails[] getWeatherAndrewAPI(@RequestParam(value = "location") String location) {
        return andrewWeatherAPI.getWeather(location);
    }


}
