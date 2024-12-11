package com.sfa.saayam_volunteerorg_service.service;

import java.util.ArrayList; // Added import
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.sfa.saayam_volunteerorg_service.model.VolunteerOrganisation;


//@Service
public class VolunteerOrgRequestService {

    public ArrayList<VolunteerOrganisation> getVolunteerOrganisationsByTopic(String topic, Pageable pageable){
        
        // ToDo: Make API call to get volunteer organisations
        ArrayList<VolunteerOrganisation> volunteerOrganisationList = new ArrayList<VolunteerOrganisation>();

        VolunteerOrganisation dummyOrganisation = new VolunteerOrganisation("OrgName", "OrgLocation", "OrgType", "OrgCategory", "orgDesc", "contact", "email@gmail.com", "website.com", "orgstatus");
        volunteerOrganisationList.add(dummyOrganisation);
        return volunteerOrganisationList;
    }

}
