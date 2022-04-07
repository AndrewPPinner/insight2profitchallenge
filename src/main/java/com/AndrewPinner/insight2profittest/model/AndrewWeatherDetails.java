package com.AndrewPinner.insight2profittest.model;


//Object to organize response data from my own api
public class AndrewWeatherDetails {
    private String day;
    private int high;
    private int low;
    private String icon;
    private String condition;

    public AndrewWeatherDetails() {

    }

    public AndrewWeatherDetails(String day, int high, int low, String icon, String condition) {
        this.day = day;
        this.high = high;
        this.low = low;
        this.icon = icon;
        this.condition = condition;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
