package com.spring_boot_validation.SpringBootValidation.pojos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    @NotNull(message = "is required!")
    @Size(min = 1,message = "is required!")
    private String firstName="";

    private String lastName;

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
                '}';
    }
}
