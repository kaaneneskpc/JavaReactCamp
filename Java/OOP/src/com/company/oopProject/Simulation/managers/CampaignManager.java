package com.company.oopProject.Simulation.managers;

import com.company.oopProject.Simulation.models.Campaign;
import com.company.oopProject.Simulation.services.CampaignService;

public class CampaignManager implements CampaignService {
    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignDetail()+"Added");
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println(campaign.getCampaignDetail()+"Deleted");
    }

    @Override
    public void updateCampaign(Campaign campaign) {

        System.out.println(campaign.getCampaignDetail()+"Updated"
        );
    }
}
