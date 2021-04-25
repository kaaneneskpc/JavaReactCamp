package com.company.oopProject.Homework1.manager;

import com.company.oopProject.Homework1.model.Course;

public class CourseManager {

    public void addCourse(Course course){
        System.out.println(course.name+" "+"Added to Course");
    }

    public void isCompleted(Course course){

        if(course.completedRate!=100.0){
            System.out.println("Course is not completed");
        }
        else{
            System.out.println("Course is completed");
        }

    }
}
