package com.sfa.saayam_volunteerorg_service.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfa.saayam_volunteerorg_service.model.VolunteerOrganisation;
import com.sfa.saayam_volunteerorg_service.repository.RequestRepository;
import com.sfa.saayam_volunteerorg_service.service.VolunteerOrgRequestService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import io.swagger.v3.oas.annotations.tags.Tag;

//@RestController
//@RequestMapping("/volunteerorg")
//@Tag(name = "Fetch Volunteer Orgs", description = "Fetch volunteer organizations related to the request")
public class VolunteerOrgController {

    @Autowired 
    VolunteerOrgRequestService volunteerOrgRequestService;
    @Autowired
    private RequestRepository requestRepository;

    @GetMapping("/ping")
    public LocalDate ping() {
        return LocalDate.now();
    }

    @GetMapping("/{requestId}")
    public ArrayList<VolunteerOrganisation> getVolunteerOrgsByRequestId(@PathVariable String requestId, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
    
        String topic = "Clothes"; //requestRepository.findById(requestId).orElse(null).getRequestType();
        Pageable pageable = PageRequest.of(page, size);
        return volunteerOrgRequestService.getVolunteerOrganisationsByTopic(topic, pageable);
    }
}