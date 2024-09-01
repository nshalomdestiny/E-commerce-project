package com.shop.microservices.product_catalog_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shop.microservices.product_catalog_service.dto.ProductRequest;
import com.shop.microservices.product_catalog_service.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    

    // Service layer dependency injection
    @Autowired
    private ProductService productService;

    // Create a new product
    @PostMapping("/createProduct")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        //TODO: process POST request
        
    }

    // Get all products
    
    // Get a product by ID

    // Update a product

    // Delete a product

}
