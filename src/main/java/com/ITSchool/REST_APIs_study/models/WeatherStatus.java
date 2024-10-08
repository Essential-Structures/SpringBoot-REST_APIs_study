package com.ITSchool.REST_APIs_study.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WeatherStatus {
    private String cityName;
    private String weatherStatus;
    private LocalDateTime lastUpdated;
}
