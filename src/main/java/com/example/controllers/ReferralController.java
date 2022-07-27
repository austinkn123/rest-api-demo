package com.example.controllers;

import com.example.models.Referral;
import com.example.models.WeatherForecast;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.annotation.Get;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller("/referral")

public class ReferralController {

    @Post("/")
//    @Produces(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    //parameter: Referral referral
    public Referral post(Referral referral)
    {
        Boolean isEmailValid = false;
        Boolean isDateValid = false;
        LocalDate placeHoldDate = LocalDate.now();
        // process the referral here
        if(referral.emailValidation()){
            isEmailValid = true;
        }
        else{
            referral.setEmail("NotValid@Notgood.com");
        }
        if(referral.dateValidation()) {
            isDateValid = true;
        }
        else{
            referral.setDateOfBirth(placeHoldDate);
        }

        return referral;
    }


}

