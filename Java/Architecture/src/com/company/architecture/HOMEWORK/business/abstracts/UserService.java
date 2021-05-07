package com.company.architecture.HOMEWORK.business.abstracts;

import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void deleteUser(User user);
    void updateUser(User user);
    List<User> getAll();
    User get(int id);
    boolean equalEmail(String email);
    boolean equalPassword(String password);
}
