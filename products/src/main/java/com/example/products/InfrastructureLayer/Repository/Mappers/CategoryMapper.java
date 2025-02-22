package com.example.products.InfrastructureLayer.Repository.Mappers;

import com.example.products.ApplicationLayer.DTO.in.CreateCategoryRequest;
import com.example.products.ApplicationLayer.DTO.out.CreateCategoryResponse;
import com.example.products.InfrastructureLayer.Entity.Category;

public class CategoryMapper {

    public static CreateCategoryResponse toResponse(Category category) {
        if (category == null) {
            return null;
        }
        CreateCategoryResponse response = new CreateCategoryResponse();
        response.setId(category.getId());
        response.setName(category.getName());
        response.setUrl(category.getUrl());
        response.setImageURL(category.getImageURL());
        response.setCharacteristicsType(category.getCharacteristicsType());
        return response;
    }

    public static Category toEntity(CreateCategoryRequest response, String imageUrl) {
        if (response == null) {
            return null;
        }
        Category category = new Category();
        category.setName(response.getName());
        category.setUrl(response.getUrl());
        category.setImageURL(imageUrl);
        category.setCharacteristicsType(response.getCharacteristicsType());
        return category;
    }
}
