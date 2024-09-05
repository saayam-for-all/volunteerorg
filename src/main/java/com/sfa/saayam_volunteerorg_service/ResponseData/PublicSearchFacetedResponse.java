package com.sfa.saayam_volunteerorg_service.ResponseData;

public class PublicSearchFacetedResponse {
    private PublicSearchFaceted publicSearchFaceted;

	public PublicSearchFacetedResponse(PublicSearchFaceted publicSearchFaceted) {
		super();
		this.publicSearchFaceted = publicSearchFaceted;
	}

	public PublicSearchFacetedResponse() {
		super();
	}

	public PublicSearchFaceted getPublicSearchFaceted() {
		return publicSearchFaceted;
	}

	public void setPublicSearchFaceted(PublicSearchFaceted publicSearchFaceted) {
		this.publicSearchFaceted = publicSearchFaceted;
	}
    
    
}
