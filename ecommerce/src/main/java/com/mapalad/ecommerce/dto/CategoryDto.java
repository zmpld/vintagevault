package com.mapalad.ecommerce.dto;

import lombok.Data;

@Data
public class CategoryDto {

    private Long id;
    private String name;
    private String description;


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
