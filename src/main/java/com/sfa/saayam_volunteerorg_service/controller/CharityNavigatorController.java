package com.sfa.saayam_volunteerorg_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sfa.saayam_volunteerorg_service.ResponseData.CharityResponse;
import com.sfa.saayam_volunteerorg_service.service.CharityNavigatorService;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class CharityNavigatorController {

    private static final Logger logger = LoggerFactory.getLogger(CharityNavigatorController.class);

    @Autowired
    private CharityNavigatorService charityNavigatorService;

    // Updated to include 'from' parameter for pagination
    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CharityResponse> searchCharities(@RequestParam String term,
                                                           @RequestParam(defaultValue = "0") int from) {
        CharityResponse response = charityNavigatorService.searchCharities(term, from);
        logger.info("Response: " + response);
        return ResponseEntity.ok(response);
    }
}
