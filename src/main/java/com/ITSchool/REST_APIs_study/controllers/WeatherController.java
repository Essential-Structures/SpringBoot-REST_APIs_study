package com.ITSchool.REST_APIs_study.controllers;

import com.ITSchool.REST_APIs_study.models.entities.WeatherStatus;
import com.ITSchool.REST_APIs_study.services.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class WeatherController {

    private final WeatherService weatherService ;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("api/weather")
    public ResponseEntity<WeatherStatus> getWeather(@RequestParam String cityName) throws IOException {
        //city name
        //last updated
        //current weather status
         return ResponseEntity.ok(weatherService.getCityWeather(cityName));

    }
}
