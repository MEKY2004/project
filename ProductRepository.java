package com.product.project.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.product.project.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}