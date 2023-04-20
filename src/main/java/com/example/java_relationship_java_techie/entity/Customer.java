package com.example.java_relationship_java_techie.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String gender;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name="custProd_foreignKey", referencedColumnName = "id")
    private List<Product> products;

}
