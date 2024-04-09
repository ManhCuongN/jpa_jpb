package com.example.JpaSpB.repositories;


import com.example.JpaSpB.entites.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, UUID> {
    boolean existsByCategoryName(String categoryName);
}
