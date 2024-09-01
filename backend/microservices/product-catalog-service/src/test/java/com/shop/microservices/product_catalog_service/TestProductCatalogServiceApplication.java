package com.shop.microservices.product_catalog_service;

import org.springframework.boot.SpringApplication;

public class TestProductCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(ProductCatalogServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
