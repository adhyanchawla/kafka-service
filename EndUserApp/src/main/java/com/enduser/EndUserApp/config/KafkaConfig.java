package com.enduser.EndUserApp.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

//    private Logger logger = LoggerFactory.

    @KafkaListener(groupId = AppConstants.GROUP_ID, topics = AppConstants.LOCATION_UPDATE_TOPIC)
    public void updatedLocation(String message) {
        System.out.println(message);
    }
}
