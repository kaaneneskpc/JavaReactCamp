package com.company.architecture.HOMEWORK;


import com.company.architecture.HOMEWORK.business.abstracts.AuthService;
import com.company.architecture.HOMEWORK.business.abstracts.UserService;
import com.company.architecture.HOMEWORK.business.concretes.AuthManager;
import com.company.architecture.HOMEWORK.business.concretes.UserManager;
import com.company.architecture.HOMEWORK.dataAccess.concretes.InMemoryUserDao;
import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.List;

public class HomeworkMain {
  public static void main(String[] args){

      User user1 = new User();

      user1.setId(1);
      user1.setName("Kaan");
      user1.setSurname("Kapıcı");
      user1.setEmail("kaan@gmail.com");
      user1.setPassword("123456");

      UserManager userManager = new UserManager(new InMemoryUserDao());
      AuthService authService = new AuthManager(userManager);



      authService.signUp(user1);
      authService.signIn(user1);
      userManager.getAll();






  }
}
