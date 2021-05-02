package com.company.oopProject.Simulation.services;

import com.company.oopProject.Simulation.models.Campaign;
import com.company.oopProject.Simulation.models.Game;
import com.company.oopProject.Simulation.models.User;

public interface SaleService {

    void buy(Campaign campaign,Game game, User user);
    void cancel(Game game,User user);
}
