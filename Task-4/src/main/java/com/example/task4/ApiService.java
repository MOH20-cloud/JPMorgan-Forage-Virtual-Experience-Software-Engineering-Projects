package com.example.task4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    // Inject the base URL from application.properties
    @Value("${external.api.base}")
    private String base;

    // Return a Post object instead of raw String
    public Post getPostById(int id) {
        String url = base + "/posts/" + id;
        return restTemplate.getForObject(url, Post.class);
    }
}
