package com.example.geoapi.controller;

import com.example.geoapi.repository.CoordinatesRepository;
import com.example.geoapi.service.CoordinatesService;
import com.example.openapi.api.LocationApi;
import com.example.openapi.model.CoordinatesCreate;
import com.example.openapi.model.CoordinatesDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class CoordinatesController implements LocationApi {
    @Autowired
    private CoordinatesService coordinatesService;
    @Override
    public ResponseEntity<CoordinatesDetails> getDeviceLocation(UUID deviceId){
        System.out.println("test1234");
        return ok(coordinatesService.getDeviceLocation(deviceId));
    }

    @Override
    public ResponseEntity<CoordinatesDetails> addDeviceLocation(CoordinatesCreate coordinatesCreate){
        return ok(coordinatesService.addDeviceLocation(coordinatesCreate));
    }
}
