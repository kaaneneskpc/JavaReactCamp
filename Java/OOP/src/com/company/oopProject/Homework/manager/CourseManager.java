package com.company.oopProject.Homework.manager;

import com.company.oopProject.Homework.logSystem.Logger;
import com.company.oopProject.Homework.model.Course;

public class CourseManager {

    public void addCourse(Course course){

        System.out.println(course.name+" "+"Added to Course");
    }

    public void addMultiple(Course[] courses){
        for(Course course:courses){
            addCourse(course);
        }
    }

    public void isCompleted(Course course){

        if(course.completedRate!=100.0){
            System.out.println("Course is not completed");
        }
        else{
            System.out.println("Course is completed");
        }

    }

    public void logSystem(Logger logger){
        logger.log();
    }
}
