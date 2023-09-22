package org.example.mappers;

import org.example.models.OrderDetail;
import org.example.models.dtos.OrderDetailDTO;

public class OrderDetailMapper {

    public static OrderDetailDTO toOrderDetailDTO(OrderDetail orderDetail) {
        return OrderDetailDTO.builder()
                .product(ProductMapper.toProductDTO(orderDetail.getProduct()))
                .quantity(orderDetail.getQuantity())
                .build();
    }

}
