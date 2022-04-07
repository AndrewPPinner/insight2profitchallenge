package com.AndrewPinner.insight2profittest.model.weathermapping;


//used to get properties date from national weather api forecast end point
public class WeatherResponse {
    private WeatherProperty properties;

    public WeatherResponse() {
    }

    public WeatherResponse(WeatherProperty properties) {
        this.properties = properties;
    }

    public WeatherProperty getProperties() {
        return properties;
    }

    public void setProperties(WeatherProperty properties) {
        this.properties = properties;
    }
}
