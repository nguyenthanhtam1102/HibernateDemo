package org.example.services;

import org.example.models.Order;
import org.example.models.OrderId;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface OrderService {

    Order save(Order order);
    void remove(Order order);
    Order findById(OrderId orderId);
    Order findById2(long id1, UUID id2);

}
