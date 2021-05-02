package com.company.oopProject.Simulation.managers;

import com.company.oopProject.Simulation.models.Campaign;
import com.company.oopProject.Simulation.models.Game;
import com.company.oopProject.Simulation.models.User;
import com.company.oopProject.Simulation.services.SaleService;

public class SaleManager implements SaleService {
    public void buy(Campaign campaign, Game game, User user) {
        System.out.println("New game sold"+""+game.getUnitPriceAfterDiscount()+"$"
                +user.getName()+" "+"buy"+" "+game.getGameName()+""+"with"+campaign.getCampaignDetail());
    }

    @Override
    public void cancel(Game game, User user) {
        System.out.println(user.getName()+""+"cancel"+" "+game.getGameName());
    }
}
