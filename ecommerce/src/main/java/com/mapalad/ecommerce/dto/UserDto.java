package com.mapalad.ecommerce.dto;

import com.mapalad.ecommerce.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;
    private String name;
    private UserRole userRole;

    public void setId(Long id) {
        this.id = id;
    }
}
