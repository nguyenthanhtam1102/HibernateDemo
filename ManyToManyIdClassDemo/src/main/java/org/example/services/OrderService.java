package org.example.services;

import org.example.models.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    Order save(Order order);
    Order findById(long id);

}
