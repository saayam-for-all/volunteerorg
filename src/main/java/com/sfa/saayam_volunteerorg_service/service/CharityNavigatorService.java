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

    // Removed 'size' and added 'from' for pagination
    public CharityResponse searchCharities(String term, int from) {
        // Updated GraphQL query to include only the 'from' parameter for pagination
        String graphqlQuery = "{ \"query\": \"query PublicSearchFaceted($term: String!, $from: Int!) { publicSearchFaceted(term: $term, from: $from) { size from term result_count results { ein name mission organization_url charity_navigator_url encompass_score encompass_star_rating encompass_publication_date cause street street2 city state zip country highest_level_advisory encompass_rating_id } } }\", \"variables\": { \"term\": \"" + term + "\", \"from\": " + from + " } }";

        String apiKey = "";

        try {
            Mono<CharityResponse> response = webClient.post()
                    .uri("/graphql")
                    .header("Content-Type", "application/json")
                    .header("Stellate-Api-Token", apiKey)
                    .bodyValue(graphqlQuery)
                    .retrieve()
                    .bodyToMono(CharityResponse.class)
                    .doOnNext(r -> System.out.println("Received response: " + r.toString()));

            return response.block();  // Blocking to return result synchronously
        } catch (WebClientResponseException e) {
            System.err.println("Error occurred: " + e.getResponseBodyAsString());
            return null;
        }
    }
}
