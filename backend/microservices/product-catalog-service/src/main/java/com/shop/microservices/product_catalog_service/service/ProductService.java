package com.shop.microservices.product_catalog_service.service;

import org.springframework.stereotype.Service;
import com.shop.microservices.product_catalog_service.dto.ProductRequest;
import com.shop.microservices.product_catalog_service.model.Product;
import com.shop.microservices.product_catalog_service.model.ProductCategory;
import com.shop.microservices.product_catalog_service.repository.ProductRepository;
import util.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductCategoryService productCategoryService;

    public void createProduct(ProductRequest productRequest) {
        // Fetch the category by name
        ProductCategory category = productCategoryService.findByName(productRequest.getName());

        // Map ProductRequest to Product
        Product product = ProductMapper.toEntity(productRequest, category);

        // Save the Product entity
        productRepository.save(product);

    }
}
