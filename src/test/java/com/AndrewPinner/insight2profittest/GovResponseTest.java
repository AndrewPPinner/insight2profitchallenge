package com.AndrewPinner.insight2profittest;

import com.AndrewPinner.insight2profittest.model.weathermapping.WeatherResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GovResponseTest {
    private String address = "4030 Mogadore Road Mogadore Ohio 44260";

    @LocalServerPort
    private int localPort;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void gov_weather_api_response_no_null() {
        WeatherResponse testResponse = testRestTemplate.getForObject("http://localhost:" + localPort + "/i2p/weather?address=" + address, WeatherResponse.class);
        assertThat(testResponse).hasNoNullFieldsOrProperties();
    }

    @Test
    public void gov_weather_api_response_has_null_no_address() {
        WeatherResponse testResponse = testRestTemplate.getForObject("http://localhost:" + localPort + "/i2p/weather?address=", WeatherResponse.class);
        assertThat(testResponse).hasAllNullFieldsOrProperties();
    }

    @Test
    public void gov_weather_api_response_has_14_weatherDetails() {
        WeatherResponse testResponse = testRestTemplate.getForObject("http://localhost:" + localPort + "/i2p/weather?address="  + address, WeatherResponse.class);
        assertThat(testResponse.getProperties().getPeriods().size()).isEqualTo(14);
    }

}
