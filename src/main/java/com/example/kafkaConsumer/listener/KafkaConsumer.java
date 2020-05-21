package com.example.kafkaConsumer.listener;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafkaConsumer.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "TestTopic", groupId = "group_id")
	public void consumer(String message) {
		System.out.println("Message:Here::1::"+message);	
	}
	
	@KafkaListener(topics = "TestTopic", groupId = "group_id", containerFactory = "concurrentKafkaListenerContainerFactory1")
	public void consumer1(List<User> message) {
		System.out.println("Message:Here comes::"+message);	
	}
	
}
