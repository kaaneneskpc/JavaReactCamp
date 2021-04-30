package com.company.oopProject.Homework.model;

public class Course extends User{

    public double completedRate;


    public Course(int id, String name, double completedRate) {
        super();
        this.completedRate = completedRate;
    }

    public Course() {
        super();
    }

    public double getCompletedRate() {
        return completedRate;
    }

    public void setCompletedRate(double completedRate) {
        this.completedRate = completedRate;
    }
}
