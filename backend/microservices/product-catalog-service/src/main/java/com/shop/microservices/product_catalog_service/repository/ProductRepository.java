package com.shop.microservices.product_catalog_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shop.microservices.product_catalog_service.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>{
    
}
