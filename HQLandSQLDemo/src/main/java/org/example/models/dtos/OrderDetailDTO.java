package org.example.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class OrderDetailDTO {

    private ProductDTO product;
    private int quantity;

}
