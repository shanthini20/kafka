package com.shan.kafkaProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shan.kafkaProject.service.KafkaProducerService;

@RestController
@RequestMapping("/api")


public class Controller {

	private final KafkaProducerService producer;

    public Controller(KafkaProducerService producer) {
        this.producer = producer;
    }

    @GetMapping("/send/{msg}")
    public String sendMessage(@PathVariable String msg) {
        producer.sendMessage(msg);
        return "Message sent: " + msg;
    }

}
