package com.AndrewPinner.insight2profittest.model.coordinatemapping;


//used to deserialize json object response from national weather API
public class CoordinateForecast {
    private Properties properties;

    public CoordinateForecast() {

    }

    public CoordinateForecast(Properties properties) {
        this.properties = properties;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
