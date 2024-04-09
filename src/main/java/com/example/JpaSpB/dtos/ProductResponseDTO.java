package com.example.JpaSpB.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductResponseDTO {

    String productId;
    String productName;
    String productDescription;
    String productThumb;
    int productQuantity;
    double productPrice;
}
