package com.example.products.InfrastructureLayer.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.products.ApplicationLayer.DTO.in.CreateCategoryRequest;
import com.example.products.ApplicationLayer.DTO.in.ProductDTO;
import com.example.products.ApplicationLayer.DTO.out.CreateCategoryResponse;
import com.example.products.InfrastructureLayer.Entity.Category;
import com.example.products.InfrastructureLayer.Repository.Mappers.CategoryMapper;



@Repository
public class CategoriesRepository {

    @Autowired
    private JpaCategoryRepository jpaCategoryRepository;

    public CreateCategoryResponse saveCategory(CreateCategoryRequest category, String imageUrl){

        Category newCategory = CategoryMapper.toEntity(category, imageUrl);
        Category savedCategory = jpaCategoryRepository.save(newCategory);
        CreateCategoryResponse responce = CategoryMapper.toResponse(savedCategory);
        return responce;
    }

    public List<CreateCategoryResponse> getAllCategories() {
        List<Category> listCategories = jpaCategoryRepository.findAll();
        return listCategories.stream().map(e->CategoryMapper.toResponse(e)).collect(Collectors.toList());
    }

    public String deleteCategory(Long id) {
        try{
            String url = jpaCategoryRepository.findById(id).get().getImageURL();
            jpaCategoryRepository.deleteById(id);
            return url;
        }
        catch(Exception e){

        }
        return "Категория не удалена";
    }

    public Category findByUrl(String type) {
        return jpaCategoryRepository.findByUrl(type);
    }


    
}
