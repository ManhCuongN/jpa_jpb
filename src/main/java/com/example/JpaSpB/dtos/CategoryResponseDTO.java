package com.example.JpaSpB.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryResponseDTO {

    String categoryId;
    String categoryName;
    String categoryDescription;
    boolean isDeleted;
    List<ProductResponseDTO> product;
}
