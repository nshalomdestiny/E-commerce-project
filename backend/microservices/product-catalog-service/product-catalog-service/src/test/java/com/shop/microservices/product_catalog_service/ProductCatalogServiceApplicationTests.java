package com.shop.microservices.product_catalog_service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ProductCatalogServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
