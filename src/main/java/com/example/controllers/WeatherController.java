package com.example.controllers;

import com.example.models.WeatherForecast;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.ArrayList;
import java.util.List;

@Controller("/weather")

public class WeatherController {

    @Get("/info")
    @Produces(MediaType.APPLICATION_JSON)
    public List<WeatherForecast> index() {
        List<WeatherForecast> weatherList = new ArrayList<WeatherForecast>();
        WeatherForecast mondayWeather = new WeatherForecast("Monday","3-6-10", 76.3, 34, "Sunny");
        weatherList.add(mondayWeather);
        WeatherForecast tuesdayWeather = new WeatherForecast("Tuesday","3-7-10", 76.6, 32, "Sunny");
        weatherList.add(tuesdayWeather);
        WeatherForecast wednesdayWeather = new WeatherForecast("Wednesday","3-8-10", 56.3, 17, "Rainy");
        weatherList.add(wednesdayWeather);
        WeatherForecast thursdayWeather = new WeatherForecast("Thursday","3-9-10", 67.2, 16, "Rainy");
        weatherList.add(thursdayWeather);
        WeatherForecast fridayWeather = new WeatherForecast("Friday","3-10-10", 69.9, 21, "Cloudy");
        weatherList.add(fridayWeather);
        WeatherForecast saturdayWeather = new WeatherForecast("Saturday","3-11-10", 70.4, 27, "Sunny");
        weatherList.add(saturdayWeather);
        WeatherForecast sundayWeather = new WeatherForecast("Sunday","3-12-10", 65.2, 19, "Foggy");
        weatherList.add(sundayWeather);


        return weatherList;
    }

//    @Get("/city/state")
//    //@Produces(MediaType.TEXT_PLAIN)
//    //List<WeatherForecast>
//    public String WeatherForecast () {
//
//        WeatherForecast weatherInfo = new WeatherForecast("5-03-21", 76.3, 43, "Sunny");
//
//
//        return weatherInfo.getLocation();
//    }
//

}

