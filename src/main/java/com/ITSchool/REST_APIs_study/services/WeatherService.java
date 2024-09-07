package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.WeatherStatus;

import java.io.IOException;

public interface WeatherService {
    WeatherStatus getCityWeather(String cityName) throws IOException;
}
