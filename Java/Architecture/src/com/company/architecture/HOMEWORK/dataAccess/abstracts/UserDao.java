package com.company.architecture.HOMEWORK.dataAccess.abstracts;

import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public interface UserDao {

    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    List<String> getEmails();
    List<User> getAll();
    User getbyId(int id);
    boolean equalEmail(String email);
    boolean equalPassword(String password);
}
