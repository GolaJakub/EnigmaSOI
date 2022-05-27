package com.example.geoapi.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy = LocationValidator.class)
public @interface Location {
    String message() default "wrong";
    //represents group of constraints
    public Class<?>[] groups() default {};
    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
