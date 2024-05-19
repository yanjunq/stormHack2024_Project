package com.example.surgehacksproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class Server {

    private final String BASE_URL = "https://api.nal.usda.gov/fdc/v1";
    private final String API_KEY = "Fdx4QkozjOYrJrDhlljgGcfAu7G5crFMeOzE9k3m";
    private final String IMG_API_KEY = "goT99dq1TO9XGVopwyVuoABejiC5Qaa8";
    private final String IMG_URL = "https://api.apilayer.com/image_to_text/upload";

    @Autowired
    public RestTemplate restTemplate;
    

    //Fetches details for multiple food items using input FDC IDs
    public String getFood() {
        String url = UriComponentsBuilder.fromHttpUrl(BASE_URL + "/foods/list")
                .queryParam("api_key", API_KEY)
                .encode()
                .toUriString();

        return restTemplate.getForObject(url, String.class);
    }

    public String searchFood(String foodName){
        String url = UriComponentsBuilder.fromHttpUrl(BASE_URL + "/foods/search")
                .queryParam("api_key", API_KEY)
                .queryParam("query", foodName)
                .encode()
                .toUriString();

        return restTemplate.getForObject(url, String.class);
    }
}

