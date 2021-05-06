package com.company.architecture.HOMEWORK.business.abstracts;

import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void deleteUser(User user);
    List<User> getAll();
    boolean equalEmail(String email);
    boolean equalPassword(String password);
}
