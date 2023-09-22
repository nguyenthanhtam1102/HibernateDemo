package org.example.services.impl;

import org.example.models.OrderDetail;
import org.example.models.OrderDetailId;
import org.example.repositories.OrderDetailsRepository;
import org.example.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailsRepository orderDetailsRepository;

    @Autowired
    public OrderDetailServiceImpl(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailsRepository.update(orderDetail);
    }

    @Override
    public OrderDetail findById(OrderDetailId orderDetailId) {
        return orderDetailsRepository.findById(orderDetailId);
    }
}
