package com.nikhil.cabbookdriver.controller;

import com.nikhil.cabbookdriver.service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity<?> updateLocation() throws InterruptedException {

        for (int i = 0; i < 50; i++) {
            cabLocationService.updateLocation(Math.random() + " , " + Math.random());
            Thread.sleep(1000);
        }

        return new ResponseEntity<>(Map.of("Message : ", "Location Updated"), HttpStatus.OK);
    }

}
