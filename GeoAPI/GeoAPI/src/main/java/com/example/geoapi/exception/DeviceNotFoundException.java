package com.example.geoapi.exception;

import java.util.UUID;

public class DeviceNotFoundException extends RuntimeException{

    public DeviceNotFoundException(UUID deviceId){
        super("Device not found with id: " + deviceId);
    }
}
