package com.example.geoapi.service;

import com.example.geoapi.exception.DeviceNotFoundException;
import com.example.geoapi.model.CoordinatesEntity;
import com.example.geoapi.repository.CoordinatesRepository;
import com.example.geoapi.validators.Location;
import com.example.openapi.model.CoordinatesCreate;
import com.example.openapi.model.CoordinatesDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

import static com.example.geoapi.mapper.CoordinatesMapper.API_MAPPER;

@Service
@RequiredArgsConstructor
@Log4j2
public class CoordinatesService {

    private final CoordinatesRepository coordinatesRepository;


    public CoordinatesDetails getDeviceLocation(@NotNull UUID deviceId) {
        log.info("Getting");
        CoordinatesEntity coordinates = coordinatesRepository.findById(deviceId).orElseThrow(() -> new DeviceNotFoundException(deviceId));

        log.info("Got device coordinates {} ", coordinates);

        return API_MAPPER.toCoordinatesDetails(coordinates);
    }

    public CoordinatesDetails addDeviceLocation(CoordinatesCreate coordinatesCreate) {

        log.info("Adding coordinates: {}",coordinatesCreate);

        CoordinatesEntity coordinatesEntity =
                coordinatesRepository.save(API_MAPPER.toCoordinatesEntity(coordinatesCreate));

        log.info("Added device with id: {}", coordinatesEntity.getDeviceId());
        return API_MAPPER.toCoordinatesDetails(coordinatesEntity);
    }

    public void updateDeviceLocation(@NotNull UUID deviceId, CoordinatesCreate coordinatesCreate) {
        log.info("Updating device with id: {}", deviceId);
        CoordinatesEntity coordinates = coordinatesRepository.findById(deviceId).orElseThrow(() -> new DeviceNotFoundException(deviceId));
        coordinates.setLatitude(coordinatesCreate.getLatitude());
        coordinates.setLongitude(coordinatesCreate.getLongitude());
        coordinatesRepository.save(coordinates);
        log.info("Updated device with id: {}", deviceId);
    }


}
