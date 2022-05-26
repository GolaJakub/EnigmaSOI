package com.example.geoapi.service;

import com.example.geoapi.exception.DeviceNotFoundException;
import com.example.geoapi.model.CoordinatesEntity;
import com.example.geoapi.repository.CoordinatesRepository;
import com.example.openapi.model.CoordinatesCreate;
import com.example.openapi.model.CoordinatesDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.UUID;
import static com.example.geoapi.mapper.CoordinatesMapper.API_MAPPER;
@Service
@RequiredArgsConstructor
public class CoordinatesService {

    private final CoordinatesRepository coordinatesRepository;


    public CoordinatesDetails getDeviceLocation(@NotNull UUID deviceId){
        CoordinatesEntity coordinates = coordinatesRepository.findById(deviceId).orElseThrow(() -> new DeviceNotFoundException(deviceId));

        return API_MAPPER.toCoordinatesDetails(coordinates);
    }

    public CoordinatesDetails addDeviceLocation(CoordinatesCreate coordinatesCreate){
        coordinatesRepository.save(API_MAPPER.toCoordinatesEntity(coordinatesCreate));
        return API_MAPPER.toCoordinatesDetails(coordinatesCreate);
    }

}
