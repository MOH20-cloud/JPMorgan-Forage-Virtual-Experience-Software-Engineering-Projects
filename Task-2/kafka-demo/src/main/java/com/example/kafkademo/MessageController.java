package com.example.kafkademo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final KafkaProducerService producerService;

    public MessageController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    // Test with: curl "http://localhost:8080/api/publish?msg=hello"
    @GetMapping("/api/publish")
    public String publishMessage(@RequestParam String msg) {
        producerService.sendMessage("my-topic", msg);
        return "Message published: " + msg;
    }
}
