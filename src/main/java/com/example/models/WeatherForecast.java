package com.example.models;

public class WeatherForecast {
    private String day = "Monday";
    private String date = "4-23-21";
    private Double temperature = 67.4;
    private Integer humidity = 44;
    private String type = "Sunny"; //Can be sunny, cloudy, rainy, cloudy

     //constructor
     public WeatherForecast(String day, String date, Double temperature, Integer humidity, String type){
         this.day = day;
         this.date = date;
         this.temperature = temperature;
         this.humidity = humidity;
         this.type = type;
     }

    public void setDate (String date){
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setTemperature (Double temperature){
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setHumidity (Integer humidity){
        this.humidity = humidity;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setType (String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDay (String day){
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public String allWeather(){
         String weather = day + "\n" + date + "\n" + temperature + "\n" + humidity + "\n"  + type;
         return weather;
    }




}