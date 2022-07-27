package com.example.models;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Referral {
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;

    //constructor
    public Referral(String firstName, String lastName, String email, LocalDate dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Referral(){

    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail (String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDateOfBirth (LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateofBirth() {
        return dateOfBirth;
    }

    public boolean emailValidation(){
        if(this.email == null || this.email.isEmpty()){
            return false;
        }

        String regex = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}";
        Pattern pattern = Pattern.compile(regex);

        if(pattern.matcher(this.email).matches()){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean dateValidation(){
        LocalDate today = LocalDate.now();
        Period age = Period.between(this.dateOfBirth, today);

//        age.getDays()   //int
//        age.getMonths() //int
//        age.getYears() //int

        if(age.getYears() >= 18){
            return true;
        }
        else{
            return false;
        }

    }
}


