package com.nnn.springbootkafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.nnn.springbootkafkaconsumer.model.UserModel;

@Service
public class KafKaConsumer {
	
	@KafkaListener(topics="Kafka_Example", groupId="group_id")
	public void consume(String message) {
		System.out.println("Cosumed message : " +message);
	}
	
	@KafkaListener(topics="Kafka_JasonExample", groupId="group_json", containerFactory= "userKafkaListenerFactory")
	public void consumeJson(UserModel userModel) {
		System.out.println("Consumed Json message : " + userModel);
	}
}
