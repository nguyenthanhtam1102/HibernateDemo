package org.example.services.impl;

import org.example.models.OrderDetail;
import org.example.models.OrderDetailId;
import org.example.repositories.OrderDetailRepository;
import org.example.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailRepository orderDetailRepository;

    @Autowired
    public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository) {
        this.orderDetailRepository = orderDetailRepository;
    }

    @Override
    public OrderDetail save(OrderDetail order) {
        return orderDetailRepository.save(order);
    }

    @Override
    public OrderDetail findById(OrderDetailId orderDetailId) {
        return orderDetailRepository.findById(orderDetailId);
    }
}
