package org.example.services;

import org.example.models.OrderDetail;
import org.example.models.OrderDetailId;
import org.springframework.stereotype.Service;

@Service
public interface OrderDetailService {

    OrderDetail save(OrderDetail orderDetail);
    OrderDetail findById(OrderDetailId orderDetailId);

}
