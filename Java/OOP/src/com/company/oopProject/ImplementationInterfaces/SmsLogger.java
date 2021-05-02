package com.company.oopProject.ImplementationInterfaces;

public class SmsLogger implements Logger{
    @Override
    public void Log(String message) {
        System.out.println("Sms sended :" + message);
    }
}
