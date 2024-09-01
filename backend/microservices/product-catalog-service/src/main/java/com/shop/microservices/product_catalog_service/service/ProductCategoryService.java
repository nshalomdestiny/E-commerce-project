package com.shop.microservices.product_catalog_service.service;


import org.springframework.stereotype.Service;

import com.shop.microservices.product_catalog_service.model.ProductCategory;
import com.shop.microservices.product_catalog_service.repository.ProductCategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductCategoryService {
    
    private final ProductCategoryRepository productCategoryRepository;

    public void createProductCategory(ProductCategory productCategory) {
        productCategoryRepository.save(productCategory);

    }

    // Method to Find ProductCategory by name
    /**
     * @param name
     * @return
     */
    public ProductCategory findByName(String name) {
        return productCategoryRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException("ProductCategory not found"));

    }
}
