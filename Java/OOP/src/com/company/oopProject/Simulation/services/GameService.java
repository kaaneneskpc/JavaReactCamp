package com.company.oopProject.Simulation.services;

import com.company.oopProject.Simulation.models.Game;
import com.company.oopProject.Simulation.models.User;

public interface GameService {

    void addGame(User user, Game game);
    void deleteGame(User user,Game game);
    void UpdateGame(User user,Game game);
}
