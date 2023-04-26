package com.Geekster.UserManagementSystem.models;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data
@AllArgsConstructor
public class User {
    @NotEmpty(message = "UserId can't be  empty")
    @NotNull
    private  String userId;

    @NotEmpty(message = "User Name  can't be  empty")
    @Size(min=2, max=30)
    private String userName;

    @Pattern(regexp =  "^([0-2][0-9]|[3][0-1])-(0[1-9]|1[0-2])-(\\d{4})$" , message = "Please enter valid date of birth...!!")
    @NotBlank
    private String dateOfBirth;


    @Email(message = "Please enter valid Email address")
    @NotEmpty
    private String email;

    @Size(min = 10 , max = 12)
    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Given phone number is not valid")
    private String phoneNumber;

    @Pattern(regexp =  "^([0-2][0-9]|[3][0-1])-(0[1-9]|1[0-2])-(\\d{4})$" , message = "Please enter valid date...!!")
    private String  date;

    @Pattern(regexp =  "^([01][0-9]|2[0-3]):[0-5][0-9]$" , message = "Please enter valid time...!!")
    private String time;
}
