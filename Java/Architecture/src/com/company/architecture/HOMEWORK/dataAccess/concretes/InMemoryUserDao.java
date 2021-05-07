package com.company.architecture.HOMEWORK.dataAccess.concretes;

import com.company.architecture.HOMEWORK.dataAccess.abstracts.UserDao;
import com.company.architecture.HOMEWORK.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;


public class InMemoryUserDao implements UserDao {

    private List<User> users;


    public InMemoryUserDao() {
        super();
        this.users = new ArrayList<User>();
    }


    @Override
    public void addUser(User user) {

        users.add(user);
        System.out.println(user.getEmail() + "Signed Up");
}

    @Override
    public void deleteUser(User user) {

        User deletedUser = users.stream().filter(d->d.getId()== user.getId()).findFirst().get();
        users.remove(deletedUser);


    }

    @Override
    public void updateUser(User user) {
        User updatedUser = users.stream().filter(u -> u.getId()== user.getId()).findFirst().get();
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        updatedUser.setName(user.getName());
        updatedUser.setSurname(user.getSurname());
        System.out.println( updatedUser.getName()+ "Updated");
    }

    @Override
    public List<String> getEmails() {
        List<String> emails = new ArrayList<String>();
        for(User user:users){
            emails.add(user.getEmail());
        }
        return emails;
    }

    @Override
    public List<User> getAll() {

        return users;

     }

    @Override
    public User getbyId(int id) {
        return users.stream().filter(u -> u.getId() == id).findFirst().get();
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
