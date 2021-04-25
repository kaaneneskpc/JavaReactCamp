package com.company.oopProject.Homework1.model;

public class Course {

    public Course() {
    }

    public Course(int id, String name, double completedRate) {
        this.id = id;
        this.name = name;
        this.completedRate = completedRate;
    }

    public int id;
    public String name;
    public double completedRate;
}
