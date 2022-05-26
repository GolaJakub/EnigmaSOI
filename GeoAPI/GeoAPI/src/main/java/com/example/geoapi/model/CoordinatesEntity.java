package com.example.geoapi.model;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "coordinates")
public class CoordinatesEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2",strategy = "uuid2")
    @Column(columnDefinition = "BINARY(36)")
    private UUID deviceId;

    @NotBlank
    private String latitude;
    @NotBlank
    private String longitude;

}
