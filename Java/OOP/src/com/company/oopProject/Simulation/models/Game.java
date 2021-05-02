package com.company.oopProject.Simulation.models;

import java.util.Date;

public class Game{

    private int gameId;
    private String gameName;
    private String gameType;
    private double unitPrice;
    private double unitPriceAfterDiscount;
    Campaign campaign;


    public Game() {
    }

    public Game(int gameId, String gameName, String gameType,double unitPrice,double unitPriceAfterDiscount,Campaign campaign) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameType = gameType;
        this.unitPrice = unitPrice;
        this.unitPriceAfterDiscount=unitPriceAfterDiscount;
        this.campaign=campaign;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    public double getUnitPriceAfterDiscount() {
        return this.unitPrice- (this.unitPrice / 100 *  this.campaign.getDiscountAmount()) ;
    }


}
