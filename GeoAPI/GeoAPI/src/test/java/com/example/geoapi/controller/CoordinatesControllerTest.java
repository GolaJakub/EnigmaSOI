package com.example.geoapi.controller;

import com.example.geoapi.exception.InvalidCoordinatesException;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


class CoordinatesControllerTest {

    ResponseSpecification checkStatusCodeAndContentType =
            new ResponseSpecBuilder().
                    expectStatusCode(200).
                    expectContentType(ContentType.JSON).
                    build();

    @Test
    void getDeviceLocation() {
    }

    @Test
    void test_addDeviceLocation_shouldThrow_InvalidCoordinatesException() {
        String latitude = "150";
        String longitude = "210";

        given().
                when().get("http://localhost:8080/addDeviceLocation").
                then().
                assertThat().body("",equals(InvalidCoordinatesException.class))


    }

    @Test
    void updateDeviceLocation() {
    }
}