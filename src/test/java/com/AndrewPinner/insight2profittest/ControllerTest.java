package com.AndrewPinner.insight2profittest;

import com.AndrewPinner.insight2profittest.controller.WeatherController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ControllerTest {

    @Autowired
    private WeatherController controller;


    @Test
    public void Controllers_Created() throws Exception {
        assertThat(controller).isNotNull();
    }


}
