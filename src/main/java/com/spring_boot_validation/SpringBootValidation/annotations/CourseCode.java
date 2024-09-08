package com.spring_boot_validation.SpringBootValidation.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstrainValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    //define value
    public String value() default "SUV";

    //define message
    public String message() default "must be start of SUV";

    //define groups
    public Class<?>[] groups() default {};

    //define payloads
    public Class<? extends Payload>[] payload() default {};
}
