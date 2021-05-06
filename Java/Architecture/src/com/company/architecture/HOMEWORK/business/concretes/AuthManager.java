package com.company.architecture.HOMEWORK.business.concretes;

import com.company.architecture.HOMEWORK.business.abstracts.AuthService;
import com.company.architecture.HOMEWORK.business.abstracts.UserService;
import com.company.architecture.HOMEWORK.entities.concretes.User;




public class AuthManager implements AuthService {


    private UserService userService;

    public AuthManager(UserService userService) {
        this.userService = userService;
    }


    @Override
    public void signIn(User user) {
     if((user.getEmail() != null && !user.getEmail().isEmpty()) &&(user.getPassword()!=null && !user.getPassword().isEmpty())){
         if(userService.equalEmail(user.getEmail()) && userService.equalPassword(user.getPassword())){
             System.out.println("Logined"+" "+user.getName());
             return;
         }
         System.out.println("Failed");

     }
    }

    @Override
    public String signUp(User user) {

       userService.addUser(user);
        System.out.println("Successly signed up : "+" "+user.getName());
        return "ABXCFT54";

    }

    @Override
    public boolean verification(User user,String code) {

        if(code=="ABXCFT54"){
            user.setVerified(true);
            return true;
        }
        return false;

    }
}
