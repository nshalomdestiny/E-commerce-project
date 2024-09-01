package com.shop.microservices.product_catalog_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection  = "product_category")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductCategory {
    @Id
    private String name;
    private String description;

}
