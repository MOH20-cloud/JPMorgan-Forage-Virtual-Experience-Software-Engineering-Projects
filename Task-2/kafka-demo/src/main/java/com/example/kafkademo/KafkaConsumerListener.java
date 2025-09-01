package com.example.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {
    @KafkaListener(topics = "my-topic", groupId = "demo-group")
    public void listen(String message) {
        System.out.println("📩 Consumed from Kafka: " + message);
    }
}
