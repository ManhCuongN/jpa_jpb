package com.example.JpaSpB.services;

import com.example.JpaSpB.dtos.CategoryRequestDTO;
import com.example.JpaSpB.dtos.CategoryResponseDTO;
import com.example.JpaSpB.entites.CategoryEntity;
import com.example.JpaSpB.exceptions.AppException;
import com.example.JpaSpB.exceptions.ErrorCode;
import com.example.JpaSpB.mappers.CategoryMapper;
import com.example.JpaSpB.mappers.CategoryMapperImpl;
import com.example.JpaSpB.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    public CategoryResponseDTO createCategory(CategoryRequestDTO request){
        if (categoryRepository.existsByCategoryName(request.getCategoryName()))
            throw new AppException(ErrorCode.CATEGORY_EXISTED);

        CategoryEntity category = categoryMapper.toCategory(request);
        category.setCategoryName((request.getCategoryName()));
        category.setCategoryDescription(request.getCategoryDescription());

        return categoryMapper.toCategoryResponse(categoryRepository.save(category));
    }
}
