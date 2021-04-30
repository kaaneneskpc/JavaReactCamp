package com.company.oopProject.Homework.model;

public class Instructor extends User{

    public String surname;

    public Instructor(){

    }

    public Instructor(int id, String name, String surname) {
        super();
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
