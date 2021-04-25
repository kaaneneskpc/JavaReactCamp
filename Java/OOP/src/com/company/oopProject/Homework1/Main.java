package com.company.oopProject.Homework1;


import com.company.oopProject.Homework1.manager.CourseManager;
import com.company.oopProject.Homework1.model.Course;
import com.company.oopProject.Homework1.model.Instructor;

public class Main {
    public static void main(String[] args) {
        final String course_tag = "-------------COURSES---------";
        final String instructor_Tag = "-------------INSTRUCTORS---------";
        final String managers_tag = "-------------MANAGERS---------";

        //Classes are reference type..

        Course course1 = new Course(1,"C#-Angular",100.0);
        Course course2 = new Course(2,"Java-React",13.2);


        Course[] courses = {course1,course2};

        System.out.println(course_tag);

        for(Course courseDetail:courses){
            System.out.println("Course id :"+courseDetail.id+" "+"Course Name:"+courseDetail.name+" "+
                    "Course Completed Rate:"+courseDetail.completedRate);
        }

        System.out.println(instructor_Tag);

        Instructor instructor1= new Instructor(1,"Engin","Demirog");

        Instructor[] instructors = {instructor1};

        for(Instructor instructorDetail:instructors){
            System.out.println("Instructor id :"+instructorDetail.id+" "+"Instructor Name:"+instructorDetail.name
                    +" "+"Instructor Surname:"+instructorDetail.surname);
        }

        System.out.println(managers_tag);

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.isCompleted(course1);
    }

}
