package org.example.mappers;

import org.example.models.Order;
import org.example.models.dtos.OrderDTO;

import java.util.stream.Collectors;

public class OrderMapper {

    public static OrderDTO toOrderDTO(Order order) {
        return OrderDTO.builder()
                .orderId(order.getId())
                .orderDate(order.getCreatedAt())
                .orderDetails(order.getOrderDetails().stream().map(OrderDetailMapper::toOrderDetailDTO).collect(Collectors.toList()))
                .build();
    }

}
