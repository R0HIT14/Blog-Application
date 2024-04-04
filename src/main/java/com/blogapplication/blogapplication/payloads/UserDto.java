package com.blogapplication.blogapplication.payloads;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    @NotEmpty
    @Size(min = 4, message = "User name should greater or equal to 4 characters")
    private String name;

    @Email(message = "Email is not valid")
    private String email;

    @NotEmpty
    @Size(min = 3, max = 10, message = "Password length should be between 3 and 10")
//    @Pattern(regexp = "")
    private String password;

    @NotEmpty
    private String about;
}
