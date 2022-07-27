package com.example.controllers;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller("/test")
public class NewController {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> index() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("test");
        stringList.add("test1");
        return stringList;
    }
}