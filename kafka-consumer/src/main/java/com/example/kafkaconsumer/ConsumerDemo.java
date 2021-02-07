package com.example.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerDemo {
	
	@KafkaListener(topics = "microservice-message",groupId = "group_id")
	public void getMessage(String message)
	{
		System.out.println(message);
	}

}
