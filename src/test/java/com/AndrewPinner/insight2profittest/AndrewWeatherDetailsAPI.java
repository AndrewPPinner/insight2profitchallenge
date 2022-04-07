package com.AndrewPinner.insight2profittest;

import com.AndrewPinner.insight2profittest.model.AndrewWeatherDetails;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AndrewWeatherDetailsAPI {
    private String zipcode = "90209";
    private String city = "Beachwood";

    @LocalServerPort
    private int localPort;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void weather_api_has_response_zipcode() {
        AndrewWeatherDetails[] testResponse = testRestTemplate.getForObject("http://localhost:" + localPort + "i2p/weather/extra?location=" + zipcode, AndrewWeatherDetails[].class);
        assertThat(testResponse).isNotEmpty();
        assertThat(testResponse[0]).hasFieldOrProperty("high");
    }


    @Test
    public void weather_api_has_no_response_to_fake_zipcode() {
        AndrewWeatherDetails[] testResponse = testRestTemplate.getForObject("http://localhost:" + localPort + "i2p/weather/extra?location=" + "0000000000", AndrewWeatherDetails[].class);
        assertThat(testResponse).isEmpty();
    }


    @Test
    public void weather_api_has_response_city() {
        AndrewWeatherDetails[] testResponse = testRestTemplate.getForObject("http://localhost:" + localPort + "i2p/weather/extra?location=" + city, AndrewWeatherDetails[].class);
        assertThat(testResponse).isNotEmpty();
        assertThat(testResponse[0]).hasFieldOrProperty("high");
    }

    @Test
//8 days: today plus the following 7 days
    public void weather_api_has_8_days() {
        AndrewWeatherDetails[] testResponseCity = testRestTemplate.getForObject("http://localhost:" + localPort + "i2p/weather/extra?location=" + city, AndrewWeatherDetails[].class);
        assertThat(testResponseCity).isNotEmpty();
        assertThat(testResponseCity.length).isEqualTo(8);

        AndrewWeatherDetails[] testResponseZipcode = testRestTemplate.getForObject("http://localhost:" + localPort + "i2p/weather/extra?location=" + zipcode, AndrewWeatherDetails[].class);
        assertThat(testResponseZipcode).isNotEmpty();
        assertThat(testResponseZipcode.length).isEqualTo(8);
    }


}
