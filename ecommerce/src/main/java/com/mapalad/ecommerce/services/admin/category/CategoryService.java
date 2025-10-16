package com.mapalad.ecommerce.services.admin.category;

import com.mapalad.ecommerce.dto.CategoryDto;
import com.mapalad.ecommerce.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createcategory(CategoryDto categoryDto);
    List<Category> getAllCategories();
}
