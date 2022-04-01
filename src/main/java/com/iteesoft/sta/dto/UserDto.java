package com.iteesoft.sta.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserDto {

    @NotBlank(message = "First Name can't be blank")
    @Size(min=3, max=15, message = "{firstName.size}")
    private String firstName;

    @NotBlank(message = "Last Name can't be blank")
    @Size(min=3, max=15, message = "{firstName.size}")
    private String lastName;

    @NotBlank(message = "Email can't be blank")
    private String email;

    @NotBlank(message = "Password can't be blank")
    @Size(min=8, max=20, message = "{password.size}")
    private String password;
}
