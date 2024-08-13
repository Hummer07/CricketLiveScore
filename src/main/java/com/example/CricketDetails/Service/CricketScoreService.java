package com.example.CricketDetails.Service;



import com.example.CricketDetails.Dto.ScoreDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;


@Service
public class CricketScoreService {

    @Value("${cricket.api.url}")
    private String apiUrl;

    @Value("${cricket.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public ScoreDto getLiveScore() {
        String url = String.format("%s?apikey=%s", apiUrl, apiKey);
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        System.out.println("Response: " + response.getBody()); // Debugging line
        return restTemplate.getForObject(url, ScoreDto.class);
    }

}
