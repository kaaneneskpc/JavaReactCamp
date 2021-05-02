package com.company.oopProject.Simulation.utils;

import com.company.oopProject.Simulation.models.User;

public class Validation {

    public static boolean Validation(User user){
        if(user.getIdentityNumber().length()>11 ){
            return false;
        }
        else if(user.getIdentityNumber().length()>0 && user.getIdentityNumber().length()<=11 &&
                !user.getIdentityNumber().startsWith("0")){
            return true;
        }
        else{
            return false;
        }


    }
}
