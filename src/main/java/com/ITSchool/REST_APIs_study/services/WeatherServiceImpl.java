package com.ITSchool.REST_APIs_study.services;

import com.ITSchool.REST_APIs_study.models.WeatherStatus;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Service
public class WeatherServiceImpl implements WeatherService {

    private final String apiUrl = "http://api.weatherapi.com/v1/current.json";
    private final String apiKey = "873d460419b14671af185140240409";

    @Override
    public WeatherStatus getCityWeather(String cityName) throws IOException {

        //take request adressed to this API and further it,"translated", to the WeatherAPI this API uses
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(apiUrl + "?key=" + apiKey + "&q=" + cityName).build();
        Response response = client.newCall(request).execute();
        log.info("Weather service called, result returned is: " + String.valueOf(response));

        //display response received from foreign API
        String responseBody = response.body().string();
        log.info("\n ResponseBody (respons.body().string(): " + responseBody);

        //setup objects to parse and select desired data from JSON response received by foreign WeatherAPI
        ObjectMapper responseMapper = new ObjectMapper();
        JsonNode jsonTranslate = responseMapper.readTree(responseBody);

        //get and format time from JSON response
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime localDateTime =LocalDateTime.parse(jsonTranslate.get("location")
                .get("localtime").asText(),dateTimeFormatter);

        //incorporate all retrieved info into a WeatherStatus object, the data type returned by weatherService
        //                  when called from the controller
        WeatherStatus weatherStatus = new WeatherStatus();
        weatherStatus.setCityName(jsonTranslate.get("location").get("name").asText());
        weatherStatus.setWeatherStatus(jsonTranslate.get("current").get("condition").get("text").asText());
        weatherStatus.setLastUpdated(localDateTime);

        log.info(weatherStatus.toString());
        return weatherStatus;
    }
}
