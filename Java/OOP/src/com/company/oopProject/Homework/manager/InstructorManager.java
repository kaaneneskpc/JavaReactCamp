package com.company.oopProject.Homework.manager;

import com.company.oopProject.Homework.logSystem.Logger;
import com.company.oopProject.Homework.model.Instructor;

public class InstructorManager {

    public void logSystem(Logger logger){
        logger.log();
    }

    public void addInstructor(Instructor instructor){

        System.out.println(instructor.name+" "+"Added");
    }
}
