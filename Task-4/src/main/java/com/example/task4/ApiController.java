package com.example.task4;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    // Dynamic: choose any post ID in the URL (e.g., /posts/5)
    @GetMapping("/posts/{id}")
    public Post getPost(@PathVariable int id) {
        return apiService.getPostById(id);
    }

    // Optional: safer endpoint with basic error handling
    @GetMapping("/safe-posts/{id}")
    public ResponseEntity<?> getSafePost(@PathVariable int id) {
        try {
            return ResponseEntity.ok(apiService.getPostById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                    .body(java.util.Map.of("error", "Upstream API failed", "detail", e.getMessage()));
        }
    }

    // Keep your original demo endpoint if you want
    @GetMapping("/external")
    public Post demoFirstPost() {
        return apiService.getPostById(1);
    }
}
