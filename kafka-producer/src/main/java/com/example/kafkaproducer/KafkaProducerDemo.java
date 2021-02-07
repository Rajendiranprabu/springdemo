package com.example.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerDemo {
	
	@Autowired
	private KafkaTemplate<String,Object> kafkaTemplate;
	final String TOPIC="microservice-message";
	
//public void produceMessage(String message)
//{
//	kafkaTemplate.send(TOPIC,message);
//}

public void produceProduct(Products product)
{
	kafkaTemplate.send(TOPIC,product);
}
}
