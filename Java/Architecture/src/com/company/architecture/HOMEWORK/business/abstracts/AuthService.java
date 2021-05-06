package com.company.architecture.HOMEWORK.business.abstracts;

import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.ArrayList;

public interface AuthService {

    void signIn(User user);
    String  signUp(User user);
    boolean verification(User user,String code);
}

