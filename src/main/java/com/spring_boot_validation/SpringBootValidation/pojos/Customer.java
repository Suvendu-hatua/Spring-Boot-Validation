package com.spring_boot_validation.SpringBootValidation.pojos;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull(message = "is required!")
    @Size(min = 1,message = "is required!")
    private String firstName;

    private String lastName;
    
    @NotNull(message = "is required!")
    @Max(value = 10,message = "Pass Number can not be more than 10.")
    @Min(value = 1,message = "Pass Number must be greater than or equal to 1")
    private Integer passNumber;

    public void setPassNumber(Integer passNumber) {
        this.passNumber = passNumber;
    }

    public Integer getPassNumber() {
        return passNumber;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passNumber=" + passNumber +
                '}';
    }
}
