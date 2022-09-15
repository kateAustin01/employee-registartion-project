package com.cydeo.employeeregistartionproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;
    private Local birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
