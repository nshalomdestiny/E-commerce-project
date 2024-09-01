package util.mapper;

import org.springframework.stereotype.Component;

import com.shop.microservices.product_catalog_service.dto.ProductRequest;
import com.shop.microservices.product_catalog_service.model.Product;
import com.shop.microservices.product_catalog_service.model.ProductCategory;

@Component
public class ProductMapper {


    public static Product toEntity(ProductRequest productRequest, ProductCategory category) {

        return Product.builder()
            .name(productRequest.getName())
            .description(productRequest.getDescription())
            .price(productRequest.getPrice())
            .category(category)
            .sellerAccount(productRequest.getSellerAccount())
            .build();
    }
    
}
