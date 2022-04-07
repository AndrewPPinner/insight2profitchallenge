package com.AndrewPinner.insight2profittest.services;

import com.AndrewPinner.insight2profittest.model.geocodemapping.AddressCoordinates;
import com.AndrewPinner.insight2profittest.model.Coordinates;
import com.AndrewPinner.insight2profittest.model.coordinatemapping.CoordinateForecast;
import com.AndrewPinner.insight2profittest.model.weathermapping.WeatherResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;


//Service component to take JSON response from API and turn into Java object to send to front-end
@Component
public class GovWeatherAPIService implements GovWeatherAPI {
    RestTemplate restTemplate = new RestTemplate();

//passed address from the controller to the geocoding API to get coordinates
    public Coordinates getCoordinates(String address) {
        AddressCoordinates results = null;
        try {
            results = restTemplate.getForObject("https://geocoding.geo.census.gov/geocoder/locations/onelineaddress?address=" + address + "&benchmark=2020&format=json", AddressCoordinates.class);
        }
        catch (ResourceAccessException | RestClientResponseException e) {
            System.out.println(e);
        }
        return new Coordinates(results.getResult().getAddressMatches().get(0).getCoordinates().getX(), results.getResult().getAddressMatches().get(0).getCoordinates().getY());
    }

//passed coordinates from the above response to the controller to the national weather API
    public WeatherResponse getWeather(Coordinates coordinates) {
        CoordinateForecast results = null;
        WeatherResponse weatherResponse = null;
        try {
            results = restTemplate.getForObject("https://api.weather.gov/points/" + coordinates.getY() + "," + coordinates.getX(), CoordinateForecast.class);
            String forecastURL = results.getProperties().getForecast();
            weatherResponse = restTemplate.getForObject(forecastURL, WeatherResponse.class);
        } catch (RestClientResponseException | ResourceAccessException e) {
            System.out.println(e);
        }
        return weatherResponse;
    }

}
