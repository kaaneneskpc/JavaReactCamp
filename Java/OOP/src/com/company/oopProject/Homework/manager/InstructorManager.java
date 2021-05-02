package com.company.oopProject.Homework.manager;

import com.company.oopProject.Homework.logSystem.Logger;
import com.company.oopProject.Homework.model.Instructor;

public class InstructorManager {



    public void addInstructor(Instructor instructor,Logger logger){

        System.out.println(instructor.name+" "+"Added");
        logger.log();
    }
}
