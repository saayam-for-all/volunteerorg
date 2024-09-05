package com.sfa.saayam_volunteerorg_service.ResponseData;

import java.util.List;

public class CharityResponse {

	  private Data data;
	  
	 public static class Data {
	        private PublicSearchFaceted publicSearchFaceted;

			public PublicSearchFaceted getPublicSearchFaceted() {
				return publicSearchFaceted;
			}

			public void setPublicSearchFaceted(PublicSearchFaceted publicSearchFaceted) {
				this.publicSearchFaceted = publicSearchFaceted;
			}

	        // Getters and setters
	    }

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	public static class PublicSearchFaceted {
        private int size;
        private int from;
        private String term;
        private int result_count;
        private List<CharityResult> results;
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getFrom() {
			return from;
		}
		public void setFrom(int from) {
			this.from = from;
		}
		public String getTerm() {
			return term;
		}
		public void setTerm(String term) {
			this.term = term;
		}
		public int getResult_count() {
			return result_count;
		}
		public void setResult_count(int result_count) {
			this.result_count = result_count;
		}
		public List<CharityResult> getResults() {
			return results;
		}
		public void setResults(List<CharityResult> results) {
			this.results = results;
		}

        
    }

    public static class CharityResult {
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
	 
}

