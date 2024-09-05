package com.sfa.saayam_volunteerorg_service.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Request {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long requestId;
    private String requestDescription;
    private LocalDateTime requestTime;
    private String requestStatus;
    private String requestPriority;
    private String requestLocation;
    private String requestCategory;
    private String requestType;
    private String requestFor;
       
	public Request() {
		super();
	}
	public Request(Long requestId, String requestDescription, LocalDateTime requestTime, String requestStatus,
			String requestPriority, String requestLocation, String requestCategory, String requestType,
			String requestFor) {
		super();
		this.requestId = requestId;
		this.requestDescription = requestDescription;
		this.requestTime = requestTime;
		this.requestStatus = requestStatus;
		this.requestPriority = requestPriority;
		this.requestLocation = requestLocation;
		this.requestCategory = requestCategory;
		this.requestType = requestType;
		this.requestFor = requestFor;
	}
	
	
	
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public String getRequestDescription() {
		return requestDescription;
	}
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	public LocalDateTime getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(LocalDateTime requestTime) {
		this.requestTime = requestTime;
	}
	public String getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}
	public String getRequestPriority() {
		return requestPriority;
	}
	public void setRequestPriority(String requestPriority) {
		this.requestPriority = requestPriority;
	}
	public String getRequestLocation() {
		return requestLocation;
	}
	public void setRequestLocation(String requestLocation) {
		this.requestLocation = requestLocation;
	}
	public String getRequestCategory() {
		return requestCategory;
	}
	public void setRequestCategory(String requestCategory) {
		this.requestCategory = requestCategory;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getRequestFor() {
		return requestFor;
	}
	public void setRequestFor(String requestFor) {
		this.requestFor = requestFor;
	}

    
}
