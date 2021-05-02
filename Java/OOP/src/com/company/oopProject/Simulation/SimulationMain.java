package com.company.oopProject.Simulation;

import com.company.oopProject.Simulation.managers.CampaignManager;
import com.company.oopProject.Simulation.managers.SaleManager;
import com.company.oopProject.Simulation.managers.UserManager;
import com.company.oopProject.Simulation.models.Campaign;
import com.company.oopProject.Simulation.models.Game;
import com.company.oopProject.Simulation.models.User;
import com.company.oopProject.models.Product;

public class SimulationMain {

    public static void main(String[] args){

        User user1 = new User();
        user1.setUserId(1);
        user1.setName("Kaan");
        user1.setSurname("Kapıcı");
        user1.setIdentityNumber("21111111111");
        user1.setBirthDate("03.11.1998");

        User user2 = new User();
        user2.setUserId(2);
        user2.setName("İrem");
        user2.setSurname("Öztürk");
        user2.setIdentityNumber("21111111111");
        user2.setBirthDate("14.11.1998");

        Campaign campaign1=new Campaign();
        campaign1.setCampaignId(1);
        campaign1.setCampaignDetail("Winter Season Campaign");
        campaign1.setDiscountAmount(30.0);

        Campaign campaign2=new Campaign();
        campaign2.setCampaignId(2);
        campaign2.setCampaignDetail("Summer Season Campaign");
        campaign2.setDiscountAmount(45.0);

        Game game1 = new Game();
        game1.setGameId(1);
        game1.setGameName("F1 2020");
        game1.setGameType("Simulation");
        game1.setUnitPrice(99.90);
        game1.setCampaign(campaign1);


        Game game2 = new Game();
        game2.setGameId(2);
        game2.setGameName("F1 2021");
        game2.setGameType("Simulation");
        game2.setUnitPrice(499.90);
        game2.setCampaign(campaign2);




        UserManager userManager = new UserManager();

        userManager.register(user1);

        User[] users = {user1,user2};

        System.out.println("------------------USERS--------------------------");

        for(User userDetail:users){
            System.out.println("User id :"+ userDetail.getUserId()+" "+"User Name:"+ userDetail.getName()+" "+
                    "User Surname:"+userDetail.getSurname()+" "+"User Identity:"+userDetail.getIdentityNumber()
                    +" "+"BirthDay:"+userDetail.getBirthDate());
        }

        Game[] games = {game1,game2};

        System.out.println("------------------GAMES--------------------------");

        for(Game gameDetail:games){
            System.out.println("Game id :"+ gameDetail.getGameId()+" "+"Game Name:"+ gameDetail.getGameName()+" "+
                    "Game Type:"+gameDetail.getGameType()+" "+"Game Price:"+gameDetail.getUnitPrice()
                    );
        }

        System.out.println("------------------MANAGERS--------------------------");


        SaleManager saleManager = new SaleManager();
        saleManager.buy(campaign1,game1,user1);
        saleManager.buy(campaign2,game2,user2);







    }
}
