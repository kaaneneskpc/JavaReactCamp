package com.company.architecture.HOMEWORK.dataAccess.concretes;

import com.company.architecture.HOMEWORK.dataAccess.abstracts.UserDao;
import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;


public class InMemoryUserDao implements UserDao {

    ArrayList<User> users = new ArrayList<>();


    @Override
    public void addUser(User user) {
        System.out.println("User added successfully");
        users.add(user);
}

    @Override
    public void deleteUser(User user) {

        System.out.println("User deleted successfully");

    }

    @Override
    public List<User> getAll() {

        return users;
    }

    @Override
    public boolean equalEmail(String email) {

        for(User user : users){
            if(user.getEmail()==email){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equalPassword(String password) {
        for(User user : users){
            if(user.getPassword()==password){
                return true;
            }
        }
        return false;
    }
}
