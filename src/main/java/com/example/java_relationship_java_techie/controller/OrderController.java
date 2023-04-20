package com.example.java_relationship_java_techie.controller;

import com.example.java_relationship_java_techie.Dto.OrderRequest;
import com.example.java_relationship_java_techie.entity.Customer;
import com.example.java_relationship_java_techie.repository.CustomerRepo;
import com.example.java_relationship_java_techie.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;


    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest orderRequest){
        return customerRepo.save(orderRequest.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepo.findAll();
    }

}
