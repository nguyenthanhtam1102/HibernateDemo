package org.example.services.impl;

import org.example.models.Order;
import org.example.models.dtos.OrderDTO;
import org.example.repositories.OrderRepository;
import org.example.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order findById(long id) {
        return orderRepository.findById(id);
    }

    @Override
    public OrderDTO getOrderById(long id) {
        return orderRepository.getOrderById(id);
    }
}
