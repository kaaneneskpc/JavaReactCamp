package com.company.oopProject.Inheritance;



public class CustomerManager {

    public void add(Customer customer){
        System.out.println(customer.customerNumber+" "+"Added");

     }

     public  void logSystem(Logger logger){
        logger.log();
     }

    public void addMultiple(Customer[] customers){
        for(Customer customer:customers){
           add(customer);
        }
    }



}
