package com.spring_boot_validation.SpringBootValidation.pojos;

import com.spring_boot_validation.SpringBootValidation.annotations.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    @NotNull(message = "is required!")
    @Size(min = 1,message = "is required!")
    private String firstName;

    private String lastName;
    
    @NotNull(message = "is required!")
    @Max(value = 10,message = "Pass Number can not be more than 10.")
    @Min(value = 1,message = "Pass Number must be greater than or equal to 1")
    private Integer passNumber;

    @Pattern(regexp = "^[a-zA-Z0-9]{6}$",message = "Pin Number only contains alphabet and digits of 6.")
    private String pinNumber;

    @NotNull(message = "is required!")
    @CourseCode(value = "XYZ",message = "Must be Start of XYZ")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public  String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber( String pinNumber) {
        this.pinNumber = pinNumber;
    }

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
                ", pinNumber='" + pinNumber + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
