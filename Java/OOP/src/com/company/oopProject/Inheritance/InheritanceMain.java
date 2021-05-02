package com.company.oopProject.Inheritance;

import com.company.oopProject.Inheritance.Logger.DatabaseLogger;

public class InheritanceMain {

    public static void main(String[] args) {

     IndividualCustomer Kaan = new IndividualCustomer();
     Kaan.customerNumber="1111";
     CorporateCustomer HepsiBurada = new CorporateCustomer();
     HepsiBurada.customerNumber="11112";
     CustomerManager customerManager= new CustomerManager();

     Customer[] customers = {Kaan,HepsiBurada};

     customerManager.addMultiple(customers);

     customerManager.logSystem(new DatabaseLogger());


    }
}
