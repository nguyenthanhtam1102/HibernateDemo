package org.example.services.impl;

import org.example.models.Order;
import org.example.models.OrderId;
import org.example.repositories.OrderRepository;
import org.example.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

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
    public void remove(Order order) {
        orderRepository.remove(order);
    }

    @Override
    public Order findById(OrderId orderId) {
        return orderRepository.findById(orderId);
    }

    @Override
    public Order findById2(long id1, UUID id2) {
        return orderRepository.findById2(id1, id2);
    }
}
