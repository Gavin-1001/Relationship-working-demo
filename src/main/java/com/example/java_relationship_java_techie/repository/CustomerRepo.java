package com.example.java_relationship_java_techie.repository;

import com.example.java_relationship_java_techie.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
