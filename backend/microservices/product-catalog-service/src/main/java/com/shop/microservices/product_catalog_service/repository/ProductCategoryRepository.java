package com.shop.microservices.product_catalog_service.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shop.microservices.product_catalog_service.model.ProductCategory;

public interface ProductCategoryRepository extends MongoRepository<ProductCategory, String> {
    Optional<ProductCategory> findByName(String name);

}
