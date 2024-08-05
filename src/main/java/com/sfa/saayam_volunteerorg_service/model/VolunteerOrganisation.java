package com.sfa.saayam_volunteerorg_service.model;


public class VolunteerOrganisation {
    private String orgName;
    public String getOrgName() {
        return orgName;
    }

    private String orgLocation;

    public String getOrgLocation() {
        return orgLocation;
    }

    private String orgType;
    public String getOrgType() {
        return orgType;
    }

    private String orgCategory;
    public String getOrgCategory() {
        return orgCategory;
    }

    private String orgDescription;
    public String getOrgDescription() {
        return orgDescription;
    }

    private String orgContact;
    public String getOrgContact() {
        return orgContact;
    }

    private String orgEmail;
    public String getOrgEmail() {
        return orgEmail;
    }

    private String orgWebsite;
    public String getOrgWebsite() {
        return orgWebsite;
    }

    private String orgStatus;

    public String getOrgStatus() {
        return orgStatus;
    }

    public VolunteerOrganisation(String orgName, String orgLocation, String orgType, String orgCategory, String orgDescription, String orgContact, String orgEmail, String orgWebsite, String orgStatus) {
        this.orgName = orgName;
        this.orgLocation = orgLocation;
        this.orgType = orgType;
        this.orgCategory = orgCategory;
        this.orgDescription = orgDescription;
        this.orgContact = orgContact;
        this.orgEmail = orgEmail;
        this.orgWebsite = orgWebsite;
        this.orgStatus = orgStatus;
    }
}
