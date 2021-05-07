package com.company.architecture.HOMEWORK.business.concretes;

import com.company.architecture.HOMEWORK.business.abstracts.UserService;
import com.company.architecture.HOMEWORK.dataAccess.abstracts.UserDao;
import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {


    private UserDao userDao;


    public UserManager(UserDao userDao) {
        this.userDao = userDao;

    }

    @Override
    public void addUser(User user) {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());

        if(user.getName().length()>=2 && user.getSurname().length()>=2){

            if(matcher.matches()){
                if(user.getPassword().length()>=6){
                    for(User userList : userDao.getAll()){

                        if(userList.getEmail()==user.getEmail()){
                            System.out.println("Email has already created");
                            return;
  }
                     }
                    userDao.addUser(user);

                }
            }
        }

    }

    @Override
    public void deleteUser(User user) {
      userDao.deleteUser(user);
        System.out.println("User deleted"+" "+user.getName());
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
        System.out.println("User updated"+" "+user.getName());
    }

    @Override
    public List<User> getAll() {

       return userDao.getAll();

    }

    @Override
    public User get(int id) {
        return userDao.getbyId(id);
    }

    @Override
    public boolean equalEmail(String email) {

        return userDao.equalEmail(email);
    }

    @Override
    public boolean equalPassword(String password) {
        return userDao.equalPassword(password);
    }
}
