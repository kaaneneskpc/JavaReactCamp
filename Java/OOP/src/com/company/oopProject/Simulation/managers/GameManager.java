package com.company.oopProject.Simulation.managers;

import com.company.oopProject.Simulation.models.Game;
import com.company.oopProject.Simulation.models.User;
import com.company.oopProject.Simulation.services.GameService;

public class GameManager implements GameService {


    @Override
    public void addGame(User user, Game game) {
        System.out.println(user.getName()+"Added"+game.getGameName());
    }

    @Override
    public void deleteGame(User user, Game game) {
        System.out.println(user.getName()+"Deleted"+game.getGameName());
    }

    @Override
    public void UpdateGame(User user, Game game) {
        System.out.println(user.getName()+"Updated"+game.getGameName());
    }
}
