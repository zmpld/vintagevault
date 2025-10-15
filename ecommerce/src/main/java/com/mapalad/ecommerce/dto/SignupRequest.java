package com.mapalad.ecommerce.dto;

import lombok.Data;

@Data
public class SignupRequest {

    private String email;
    private String password;
    private String name;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
