package com.sfa.saayam_volunteerorg_service.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Request {
    
    @Id
    private String requestId;
    private String requestDescription;
    private LocalDateTime requestTime;
    private String requestStatus;
    private String requestPriority;
    private String requestLocation;
    private String requestCategory;
    private String requestType;
    private String requestFor;

    public Request(String requestId, String requestDescription, LocalDateTime requestTime, String requestStatus, String requestPriority, String requestLocation, String requestCategory, String requestType, String requestFor) {
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

    public String getRequestLocation(){
        return requestLocation;
    }

    public String getRequestCategory() {
        return requestCategory;
    }

    public String getRequestType() {
        return requestType;
    }
}
