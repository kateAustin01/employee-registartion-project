package com.cydeo.employeeregistartionproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    /*
*
* An empty string is a String object with an assigned value, but its length is equal to zero.
A null string has no value at all.
A blank String contains only whitespaces, are is neither empty nor null, since it does have an assigned value, and isn't of 0 length.
String nullString = null;
String emptyString = "";
String blankString = " ";
    *
    *
    * */

    @NotNull
    @NotEmpty
    @NotBlank
    @Size(max = 12,min = 2)
    private String firstName;
    private String lastName;



    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;

}
