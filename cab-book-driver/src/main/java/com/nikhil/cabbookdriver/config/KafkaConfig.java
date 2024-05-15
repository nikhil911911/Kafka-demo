package com.nikhil.cabbookdriver.config;

import com.nikhil.cabbookdriver.constant.AppContants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic(){
        return TopicBuilder
                .name(AppContants.CAB_LOCATION)
                .build();
    }
}
