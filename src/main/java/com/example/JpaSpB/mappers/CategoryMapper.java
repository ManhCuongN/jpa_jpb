package com.example.JpaSpB.mappers;

import com.example.JpaSpB.dtos.CategoryRequestDTO;
import com.example.JpaSpB.dtos.CategoryResponseDTO;
import com.example.JpaSpB.entites.CategoryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryEntity toCategory(CategoryRequestDTO request);

    CategoryResponseDTO toCategoryResponse(CategoryEntity category);

//    @Mapping(target = "roles", ignore = true)
//    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}