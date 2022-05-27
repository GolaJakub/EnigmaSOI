package com.example.geoapi.validators;

import com.example.openapi.model.CoordinatesCreate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;


public class LocationValidator implements ConstraintValidator<Location, CoordinatesCreate> {


    @Override
    public void initialize(Location constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(CoordinatesCreate coordinatesCreate, ConstraintValidatorContext constraintValidatorContext) {
        /*if(Pattern.compile("^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?)")
                .matcher(coordinatesCreate.getLatitude())
                .matches()
                &&
                Pattern.compile("^[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$")
                        .matcher(coordinatesCreate.getLatitude())
                        .matches()){
            return true;
        }*/ throw new NullPointerException("test1234");
    }
}
