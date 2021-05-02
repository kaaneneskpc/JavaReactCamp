package com.company.oopProject.Simulation.models;

public class Campaign{

   private int campaignId;
   private String campaignDetail;
   double  discountAmount;


    public Campaign() {
    }

    public Campaign(int campaignId, String campaignDetail, double discountAmount) {
        this.campaignId = campaignId;
        this.campaignDetail = campaignDetail;
        this.discountAmount = discountAmount;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignDetail() {
        return campaignDetail;
    }

    public void setCampaignDetail(String campaignDetail) {
        this.campaignDetail = campaignDetail;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
}
