package com.company.oopProject.Simulation.models;

import java.util.Date;

public class User {
    private int userId;
    private String identityNumber;
    private String name;
    private String surname;
    private String  birthDate;

    public User() {
    }

    public User(int userId, String identityNumber, String name, String surname, String birthDate) {
        this.userId = userId;
        this.identityNumber = identityNumber;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
