package com.company.oopProject.ImplementationInterfaces;

public class InterfaceMain {

    public static void main(String[] args){

       Logger[] loggers = {new EmailLogger(),new SmsLogger(),new FileLogger()};
       CustomerManager customerManager = new CustomerManager(loggers);
       Customer customer1=new Customer(1,"Kaan","Enes");
       customerManager.add(customer1);
       customerManager.delete(customer1);
    }
}
