package com.example.JpaSpB.controllers;

import com.example.JpaSpB.common.ApiResponse;
import com.example.JpaSpB.dtos.CategoryRequestDTO;
import com.example.JpaSpB.dtos.CategoryResponseDTO;
import com.example.JpaSpB.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @PostMapping("/save")
    ApiResponse<CategoryResponseDTO> createCategory(@RequestBody @Valid CategoryRequestDTO request)  {
        return ApiResponse.<CategoryResponseDTO>builder()
                .metadata(categoryService.createCategory(request))
                .build();
    }

}
