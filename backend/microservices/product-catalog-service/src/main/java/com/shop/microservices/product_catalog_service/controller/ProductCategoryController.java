package com.shop.microservices.product_catalog_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.microservices.product_catalog_service.dto.ProductCategoryRequest;

@RestController
@RequestMapping("/api/product")
public class ProductCategoryController {

    @PostMapping("/createProductCategory")
    public void createProductCategory(@RequestBody ProductCategoryRequest productCategoryRequest) {
        //TODO: process POST request
        
    }
    
    
}
