package com.sfa.saayam_volunteerorg_service.ResponseData;

public class Result {
    private String ein;
    private String name;
    private String mission;
    private String organization_url;
    private String charity_navigator_url;
    private String encompass_score;
    private String encompass_star_rating;
    private String encompass_publication_date;
    private String cause;
    private String street;
    private String street2;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String highest_level_advisory;
    private String encompass_rating_id;
	public Result(String ein, String name, String mission, String organization_url, String charity_navigator_url,
			String encompass_score, String encompass_star_rating, String encompass_publication_date, String cause,
			String street, String street2, String city, String state, String zip, String country,
			String highest_level_advisory, String encompass_rating_id) {
		super();
		this.ein = ein;
		this.name = name;
		this.mission = mission;
		this.organization_url = organization_url;
		this.charity_navigator_url = charity_navigator_url;
		this.encompass_score = encompass_score;
		this.encompass_star_rating = encompass_star_rating;
		this.encompass_publication_date = encompass_publication_date;
		this.cause = cause;
		this.street = street;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
		this.highest_level_advisory = highest_level_advisory;
		this.encompass_rating_id = encompass_rating_id;
	}
	public Result() {
		super();
	}
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
	public String getOrganization_url() {
		return organization_url;
	}
	public void setOrganization_url(String organization_url) {
		this.organization_url = organization_url;
	}
	public String getCharity_navigator_url() {
		return charity_navigator_url;
	}
	public void setCharity_navigator_url(String charity_navigator_url) {
		this.charity_navigator_url = charity_navigator_url;
	}
	public String getEncompass_score() {
		return encompass_score;
	}
	public void setEncompass_score(String encompass_score) {
		this.encompass_score = encompass_score;
	}
	public String getEncompass_star_rating() {
		return encompass_star_rating;
	}
	public void setEncompass_star_rating(String encompass_star_rating) {
		this.encompass_star_rating = encompass_star_rating;
	}
	public String getEncompass_publication_date() {
		return encompass_publication_date;
	}
	public void setEncompass_publication_date(String encompass_publication_date) {
		this.encompass_publication_date = encompass_publication_date;
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
	public String getHighest_level_advisory() {
		return highest_level_advisory;
	}
	public void setHighest_level_advisory(String highest_level_advisory) {
		this.highest_level_advisory = highest_level_advisory;
	}
	public String getEncompass_rating_id() {
		return encompass_rating_id;
	}
	public void setEncompass_rating_id(String encompass_rating_id) {
		this.encompass_rating_id = encompass_rating_id;
	}
    
    
    
}
