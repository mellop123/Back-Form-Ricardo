package com.example.form.infraestructure.configuration.security;

import lombok.Data;

@Data
public class AuthCredentials {
    private String email;
    private String password;
}
