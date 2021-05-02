package com.company.oopProject.ImplementationInterfaces;

public class EmailLogger implements Logger{
    @Override
    public void Log(String message) {
        System.out.println(" Email sended :"+ message);
    }
}
