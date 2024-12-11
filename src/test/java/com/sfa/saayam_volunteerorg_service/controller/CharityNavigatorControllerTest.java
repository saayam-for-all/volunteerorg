//package com.sfa.saayam_volunteerorg_service.controller;
//
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.ArgumentMatchers.anyString;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean; // Change from @Mock to @MockBean
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import com.sfa.saayam_volunteerorg_service.ResponseData.CharityResponse;
//import com.sfa.saayam_volunteerorg_service.ResponseData.CharityResponse.Data;
//import com.sfa.saayam_volunteerorg_service.service.CharityNavigatorService;
//
//@WebMvcTest(CharityNavigatorController.class)
//@ExtendWith(MockitoExtension.class)
//public class CharityNavigatorControllerTest {
//
//    @MockBean // Use @MockBean instead of @Mock to ensure it is injected into the context
//    private CharityNavigatorService charityNavigatorService;
//
//    @InjectMocks
//    private CharityNavigatorController charityNavigatorController;
//
//    private MockMvc mockMvc;
//
//    @BeforeEach
//    public void setup() {
//        mockMvc = MockMvcBuilders.standaloneSetup(charityNavigatorController).build();
//    }
//
//    @Test
//    public void testSearchCharities() throws Exception {
//        // Prepare expected response
//        CharityResponse mockResponse = new CharityResponse();
//        Data data = new Data();
//        CharityResponse.PublicSearchFaceted facetedData = new CharityResponse.PublicSearchFaceted();
//        
//        // Set mock data for the faceted search
//        facetedData.setTerm("Education");
//        facetedData.setFrom(0);
//        facetedData.setResult_count(10000);
//        facetedData.setSize(10);
//
//        // Create and populate the mock results
//        List<CharityResponse.> results = new ArrayList<>();
//        
//        // Add mock charity results
//        CharityResponse.Result result1 = new CharityResponse.Result();
//        result1.setEin("541382657");
//        result1.setName("Operation Blessing International");
//        result1.setCause("Human services");
//        result1.setCity("Virginia Beach");
//        result1.setState("VA");
//        result1.setZip("23463");
//        result1.setCountry("USA");
//
//        CharityResponse.Result result2 = new CharityResponse.Result();
//        result2.setEin("300108263");
//        result2.setName("GlobalGiving");
//        result2.setCause("Education");
//        result2.setCity("Washington");
//        result2.setState("DC");
//        result2.setZip("20005");
//        result2.setCountry("USA");
//
//        results.add(result1);
//        results.add(result2);
//
//        facetedData.setResults(results);
//
//        // Set the faceted data to the response
//        data.setPublicSearchFaceted(facetedData);
//        mockResponse.setData(data);
//
//        // Mock the service call
//        when(charityNavigatorService.searchCharities(anyString(), anyInt())).thenReturn(mockResponse);
//
//        // Perform the GET request and verify the response
//        mockMvc.perform(get("/search")
//                        .param("term", "Education")
//                        .param("from", "0")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(content().json("{\n" +
//                        "  \"data\": {\n" +
//                        "    \"publicSearchFaceted\": {\n" +
//                        "      \"size\": 10,\n" +
//                        "      \"from\": 0,\n" +
//                        "      \"term\": \"Education\",\n" +
//                        "      \"result_count\": 10000,\n" +
//                        "      \"results\": [\n" +
//                        "        {\n" +
//                        "          \"ein\": \"541382657\",\n" +
//                        "          \"name\": \"Operation Blessing International\",\n" +
//                        "          \"cause\": \"Human services\",\n" +
//                        "          \"city\": \"Virginia Beach\",\n" +
//                        "          \"state\": \"VA\",\n" +
//                        "          \"zip\": \"23463\",\n" +
//                        "          \"country\": \"USA\"\n" +
//                        "        },\n" +
//                        "        {\n" +
//                        "          \"ein\": \"300108263\",\n" +
//                        "          \"name\": \"GlobalGiving\",\n" +
//                        "          \"cause\": \"Education\",\n" +
//                        "          \"city\": \"Washington\",\n" +
//                        "          \"state\": \"DC\",\n" +
//                        "          \"zip\": \"20005\",\n" +
//                        "          \"country\": \"USA\"\n" +
//                        "        }\n" +
//                        "      ]\n" +
//                        "    }\n" +
//                        "  }\n" +
//                        "}"));
//    }
//
//}
