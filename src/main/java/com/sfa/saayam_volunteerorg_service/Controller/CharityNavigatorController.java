package com.sfa.saayam_volunteerorg_service.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sfa.model.CharityResponse;
import com.sfa.saayam_volunteerorg_service.service.CharityNavigatorService;

@RestController
public class CharityNavigatorController {

    private static final Logger logger = LoggerFactory.getLogger(CharityNavigatorController.class);

    
    private CharityNavigatorService charityNavigatorService;
    public CharityNavigatorController(CharityNavigatorService charityNavigatorService) {
    	this.charityNavigatorService=charityNavigatorService;
    }
    
    @GetMapping(path="/")
    public String LiveCheckerFunction() {
    	return "Application Live";
    }

    @GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CharityResponse> searchCharities(@RequestParam String term,
                                                           @RequestParam(defaultValue = "0") int from) {
    	logger.atInfo().addKeyValue("term", term).log("Search started for term.");
    	CharityResponse response=null;
    	response = charityNavigatorService.searchCharities(term, from);
    	logger.atInfo().log("Successfully returning item");
        return ResponseEntity.ok(response);
    }
}