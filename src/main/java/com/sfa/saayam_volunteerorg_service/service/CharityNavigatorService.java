package com.sfa.saayam_volunteerorg_service.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.sfa.saayam_volunteerorg_service.ResponseData.CharityResponse;

import reactor.core.publisher.Mono;

@Service
public class CharityNavigatorService {

    private final WebClient webClient;

    public CharityNavigatorService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
            .baseUrl("https://data.charitynavigator.org")
            .build();
    }

    public CharityResponse searchCharities(String term, int from) {
        String graphqlQuery = "{ \"query\": \"query PublicSearchFaceted($term: String!, $from: Int!) { publicSearchFaceted(term: $term, from: $from) { size from term result_count results { ein name mission cause street street2 city state zip country} } }\", \"variables\": { \"term\": \"" + term + "\", \"from\": " + from + " } }";

        String apiKey = "stl8_0c83d84ca5692fce63cc171f00f6bdfce13e4bfc11775daa52b77d9c711e2c7a";

        try {
            Mono<CharityResponse> response = webClient.post()
                    .uri("/graphql")
                    .header("Content-Type", "application/json")
                    .header("Stellate-Api-Token", apiKey)
                    .bodyValue(graphqlQuery)
                    .retrieve()
                    .bodyToMono(CharityResponse.class);

            return response.block();  // Blocking to return result synchronously
        } catch (WebClientResponseException e) {
            System.err.println("Error occurred: " + e.getResponseBodyAsString());
            return null;
        }
    }
}
