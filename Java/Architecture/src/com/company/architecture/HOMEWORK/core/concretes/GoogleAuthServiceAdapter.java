package com.company.architecture.HOMEWORK.core.concretes;


import com.company.architecture.HOMEWORK.googleAuth.GoogleAuthManager;

public class GoogleAuthServiceAdapter{

    public void signIn(String email,String password){

        GoogleAuthManager googleAuthManager = new GoogleAuthManager();
        googleAuthManager.signIn(email,password);

    }

}
