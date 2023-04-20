package com.example.java_relationship_java_techie.repository;

import com.example.java_relationship_java_techie.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
