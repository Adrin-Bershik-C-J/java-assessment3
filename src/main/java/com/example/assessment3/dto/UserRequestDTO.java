package com.example.assessment3.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequestDTO {

    @NotBlank(message = "Name should not be blank")
    @Size(max = 20, message = "Shorten your name with a max of 20 characters")
    private String name;

    @Email(message = "Improper email format")
    @NotBlank(message = "Email should not be blank")
    private String email;
}
