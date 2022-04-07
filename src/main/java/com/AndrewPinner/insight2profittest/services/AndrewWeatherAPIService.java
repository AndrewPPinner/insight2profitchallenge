package com.AndrewPinner.insight2profittest.services;
import com.AndrewPinner.insight2profittest.model.AndrewWeatherDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

//Service component to take JSON response from API and turn into Java object to send to front-end
@Component
public class AndrewWeatherAPIService implements AndrewWeatherAPI {
    RestTemplate restTemplate = new RestTemplate();

    public AndrewWeatherDetails[] getWeather(String location) {
        AndrewWeatherDetails[] response = null;
        try{
            response = restTemplate.getForObject("https://andrew-pinner.asuscomm.com/weather/week?loc=" + location, AndrewWeatherDetails[].class);
        } catch (RestClientResponseException | ResourceAccessException e) {
            System.out.println(e);
        }
        return response;
    }



}
