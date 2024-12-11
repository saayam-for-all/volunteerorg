package com.sfa.saayam_volunteerorg_service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.sfa.saayam_volunteerorg_service.service.CharityNavigatorService;

@SpringBootTest
class SaayamVolunteerorgServiceApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    void contextLoads() {
        // Verifying that the Spring context is loaded
    }

    @Test
    void charityNavigatorServiceBeanIsLoaded() {
        // Check if the CharityNavigatorService bean is loaded into the context
        assertThat(context.getBean(CharityNavigatorService.class)).isNotNull();
    }
}
