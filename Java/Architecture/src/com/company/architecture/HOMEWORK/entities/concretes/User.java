package com.company.architecture.HOMEWORK.entities.concretes;

import com.company.architecture.HOMEWORK.entities.abstracts.Entity;

public class User implements Entity {

    private int id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private boolean isVerified;

    public User() {
    }

    public User(int id, String email, String password, String name, String surname, boolean isVerified) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.isVerified = isVerified;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }
}
