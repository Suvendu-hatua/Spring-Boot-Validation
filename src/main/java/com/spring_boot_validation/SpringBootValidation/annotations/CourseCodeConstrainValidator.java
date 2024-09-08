package com.spring_boot_validation.SpringBootValidation.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstrainValidator implements ConstraintValidator<CourseCode,String> {
    private String codePrefix;
    @Override
    public void initialize(CourseCode code) {
        codePrefix=code.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {

        if(code!=null){
            if(code.startsWith(codePrefix)){
                return true;
            }
            return false;
        }
        return true;
    }
}
