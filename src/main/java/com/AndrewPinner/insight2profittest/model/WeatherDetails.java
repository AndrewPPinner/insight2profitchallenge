package com.AndrewPinner.insight2profittest.model;



//Object to organize response from national weather forecast api
public class WeatherDetails {

     private String name;
     private boolean isDaytime;
     private int temperature;
     private String icon;
     private String shortForecast;
     private String detailedForecast;



    public WeatherDetails() {

    }

    public WeatherDetails(String name, boolean isDaytime, int temperature,String icon, String shortForecast, String detailedForecast) {
        this.name = name;
        this.isDaytime = isDaytime;
        this.temperature = temperature;
        this.icon = icon;
        this.shortForecast = shortForecast;
        this.detailedForecast = detailedForecast;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isDaytime() {
        return isDaytime;
    }

    public void setDaytime(boolean daytime) {
        isDaytime = daytime;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getShortForecast() {
        return shortForecast;
    }

    public void setShortForecast(String shortForecast) {
        this.shortForecast = shortForecast;
    }

    public String getDetailedForecast() {
        return detailedForecast;
    }

    public void setDetailedForecast(String detailedForecast) {
        this.detailedForecast = detailedForecast;
    }
}
