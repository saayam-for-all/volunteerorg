package com.sfa.saayam_volunteerorg_service.model;

public class Charity {

    private String ein;
    private String name;
    private String mission;
    private String cause;
    private String street;
    private String street2;
    private String city;
    private String state;
    private String zip;
    private String country;

    // Constructor
    public Charity(String ein, String name, String mission, String cause, String street, String street2,
                   String city, String state, String zip, String country) {
        this.ein = ein;
        this.name = name;
        this.mission = mission;
        this.cause = cause;
        this.street = street;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    // Getters and Setters
    public String getEin() {
        return ein;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Charity{" +
                "ein='" + ein + '\'' +
                ", name='" + name + '\'' +
                ", mission='" + mission + '\'' +
                ", cause='" + cause + '\'' +
                ", street='" + street + '\'' +
                ", street2='" + street2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
