package com.example.JpaSpB.entites;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class ProductEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String productId;

    private String productName;
    private String productDescription;
    private String productThumb;
    private int productQuantity;
    private double productPrice;
    private boolean isDeleted;
    @ManyToOne
    @JoinColumn(name = "categoryId")
    private CategoryEntity category;


}
