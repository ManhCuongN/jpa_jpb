package com.example.JpaSpB.dtos;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryRequestDTO {

    @NotEmpty(message = "Category Name Is Not Empty")
    private String categoryName;

    @NotEmpty(message = "Category Description Is Not Empty")
    private String categoryDescription;

}
