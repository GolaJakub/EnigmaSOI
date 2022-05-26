package com.example.geoapi.mapper;

import com.example.geoapi.model.CoordinatesEntity;
import com.example.openapi.model.CoordinatesCreate;
import com.example.openapi.model.CoordinatesDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CoordinatesMapper {

    CoordinatesMapper API_MAPPER = Mappers.getMapper(CoordinatesMapper.class);

    CoordinatesDetails toCoordinatesDetails(CoordinatesEntity coordinatesEntity);

    CoordinatesEntity toCoordinatesEntity(CoordinatesDetails coordinatesDetails);

    CoordinatesCreate toCoordinatesCreate(CoordinatesDetails coordinatesDetails);

    CoordinatesDetails toCoordinatesDetails(CoordinatesCreate coordinatesCreate);

    CoordinatesEntity toCoordinatesEntity(CoordinatesCreate coordinatesCreate);
}
