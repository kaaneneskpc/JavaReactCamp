package com.company.oopProject.Homework;


import com.company.oopProject.Homework.logSystem.DatabaseLogger;
import com.company.oopProject.Homework.logSystem.EmailLogger;
import com.company.oopProject.Homework.manager.CourseManager;
import com.company.oopProject.Homework.manager.InstructorManager;
import com.company.oopProject.Homework.model.Course;
import com.company.oopProject.Homework.model.Instructor;

public class HomeworkMain {
    public static void main(String[] args) {
        final String course_tag = "-------------COURSES---------";
        final String instructor_Tag = "-------------INSTRUCTORS---------";
        final String managers_tag = "-------------MANAGERS---------";
        final String split_line = "-----------------------";

        //Classes are reference type..

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("C# Angular");
        course1.setCompletedRate(100.0);

        Course course2 = new Course();
        course2.setId(2);
        course2.setName("Java React");
        course2.setCompletedRate(99.0);



        Course[] courses = {course1,course2};

        System.out.println(course_tag);

        for(Course courseDetail:courses){
            System.out.println("Course id :"+courseDetail.id+" "+"Course Name:"+courseDetail.name+" "+
                    "Course Completed Rate:"+courseDetail.completedRate);
        }

        System.out.println(instructor_Tag);

        Instructor instructor1= new Instructor();
        instructor1.setId(1);
        instructor1.setName("Engin");
        instructor1.setSurname("Demirog");

        Instructor[] instructors = {instructor1};

        for(Instructor instructorDetail:instructors){
            System.out.println("Instructor id :"+instructorDetail.id+" "+"Instructor Name:"+instructorDetail.name
                    +" "+"Instructor Surname:"+instructorDetail.surname);
        }

        System.out.println(managers_tag);

        CourseManager courseManager = new CourseManager();
        InstructorManager instructorManager=new InstructorManager();
        //courseManager.addCourse(course1);
        courseManager.isCompleted(course1);
        courseManager.addMultiple(courses);
        System.out.println(split_line);
        instructorManager.addInstructor(instructor1);
        System.out.println(split_line);
        courseManager.logSystem(new DatabaseLogger());
        instructorManager.logSystem(new EmailLogger());
    }

}
