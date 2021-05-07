package com.company.architecture.HOMEWORK.business.concretes;

import com.company.architecture.HOMEWORK.business.abstracts.AuthService;
import com.company.architecture.HOMEWORK.business.abstracts.UserService;
import com.company.architecture.HOMEWORK.core.concretes.GoogleAuthServiceAdapter;
import com.company.architecture.HOMEWORK.entities.concretes.User;




public class AuthManager implements AuthService {


    private UserService userService;


    public AuthManager(UserService userService) {
        super();
        this.userService = userService;

    }


    @Override
    public void signIn(User user) {
     if(isVerified(user)) {
         if (userService.equalEmail(user.getEmail()) && userService.equalPassword(user.getPassword())) {
             System.out.println("Sign In is successfully.Welcome" + " " + user.getName());
             return;
         }
     }


     }


    @Override
    public String signUp(User user) {

       userService.addUser(user);
        System.out.println("Welcome"+" "+user.getName()+" Please check your email for verification ");
        return "ABXCFT54";

    }

    @Override
    public boolean verification(User user,String code) {

        if(code=="ABXCFT54"){
            user.setVerified(true);
            System.out.println(user.getEmail()+" "+" verified successfully"+" "+"and code is :"+code);
            System.out.println("Code's matched . Successfully signed up : "+" "+user.getName());
            return true;
        }
        System.out.println(user.getEmail()+" "+" not verified ");
        return false;


    }

    @Override
    public void signInWithGoogle(User user) {
        if(userService.equalEmail(user.getEmail())){
            User userVerified = userService.get(user.getId());
            userVerified.setVerified(true);
        }
        else{
            userService.addUser(user);
            user.setVerified(true);
        }

       if(isVerified(user)){
           GoogleAuthServiceAdapter adapter = new GoogleAuthServiceAdapter();
           adapter.signIn(user.getEmail(), user.getPassword());
           return;
       }
        System.out.println("Google sign in is not successfully");



    }

    private boolean isVerified(User user){
        if((user.getEmail() != null && !user.getEmail().isEmpty()) &&(user.getPassword()!=null && !user.getPassword().isEmpty())
                && user.isVerified()){
            return true;
        }
        return false;
    }
}