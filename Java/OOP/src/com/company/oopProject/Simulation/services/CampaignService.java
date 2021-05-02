package com.company.oopProject.Simulation.services;

import com.company.oopProject.Simulation.models.Campaign;
import com.company.oopProject.Simulation.models.Game;

public interface CampaignService {

    void addCampaign(Campaign campaign);
    void deleteCampaign(Campaign campaign);
    void updateCampaign(Campaign campaign);
}
