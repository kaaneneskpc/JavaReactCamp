package com.company.oopProject.Simulation.managers;

import com.company.oopProject.ImplementationInterfaces.Utils;
import com.company.oopProject.Simulation.models.User;
import com.company.oopProject.Simulation.services.UserService;
import com.company.oopProject.Simulation.utils.Validation;

public class UserManager implements UserService {

    @Override
    public void register(User user) {
        boolean validation = Validation.Validation(user);
        if(validation==true){
            System.out.println("Logined to System"+" "+"Welcome"+" "+user.getName());
        }
        else{
            System.out.println("Wrong ID");
        }
    }
}
