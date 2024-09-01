package util.mapper;

import org.springframework.stereotype.Component;

import com.shop.microservices.product_catalog_service.dto.ProductCategoryRequest;
import com.shop.microservices.product_catalog_service.model.ProductCategory;

@Component
public class ProductCategoryMapper {
    
    public static ProductCategory toEntity(ProductCategoryRequest productCategoryRequest, ProductCategory category) {
        return ProductCategory.builder()
            .name(productCategoryRequest.getName())
            .description(productCategoryRequest.getDescription())
            .build();
            
    }

}
