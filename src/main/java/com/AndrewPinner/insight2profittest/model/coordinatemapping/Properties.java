package com.AndrewPinner.insight2profittest.model.coordinatemapping;


//used to deserialize national weather api to get the forecast URL
public class Properties {
    private String forecast;

    public Properties() {

    }

    public Properties(String forecast) {
        this.forecast = forecast;
    }

    public String getForecast() {
        return forecast;
    }

    public void setForecast(String forecast) {
        this.forecast = forecast;
    }
}
