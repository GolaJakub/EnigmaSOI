package com.example.geoapi.model;


import com.example.geoapi.validators.Location;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
@Entity
@Table(name = "coordinates")
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class CoordinatesEntity {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(length = 36, nullable = false, updatable = false)
    private UUID deviceId;

    @NotBlank
    private String latitude;
    @NotBlank
    private String longitude;

}
