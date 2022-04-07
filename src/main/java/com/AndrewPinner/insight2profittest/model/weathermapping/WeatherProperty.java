package com.AndrewPinner.insight2profittest.model.weathermapping;

import com.AndrewPinner.insight2profittest.model.WeatherDetails;

import java.util.List;

//used to get specific date from national weather api forecast end point
public class WeatherProperty {
    private List<WeatherDetails> periods;


    public WeatherProperty() {
    }

    public WeatherProperty(List<WeatherDetails> periods) {
        this.periods = periods;
    }

    public List<WeatherDetails> getPeriods() {
        return periods;
    }

    public void setPeriods(List<WeatherDetails> periods) {
        this.periods = periods;
    }
}
