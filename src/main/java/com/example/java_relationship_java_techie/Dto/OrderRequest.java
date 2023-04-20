package com.example.java_relationship_java_techie.Dto;

import com.example.java_relationship_java_techie.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {

    private Customer customer;
}
