package org.example.mappers;

import org.example.models.Product;
import org.example.models.dtos.ProductDTO;

public class ProductMapper {

    public static ProductDTO toProductDTO(Product product) {
        return ProductDTO.builder()
                .productId(product.getId())
                .productName(product.getName())
                .build();
    }

}
