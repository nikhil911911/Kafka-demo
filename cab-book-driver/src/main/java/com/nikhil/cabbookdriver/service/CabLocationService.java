package com.nikhil.cabbookdriver.service;

import com.nikhil.cabbookdriver.constant.AppContants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void updateLocation(String location){
        kafkaTemplate.send(AppContants.CAB_LOCATION, location);
    }

}
