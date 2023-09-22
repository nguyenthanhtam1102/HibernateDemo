package org.example.repositories;

import org.example.models.OrderDetail;
import org.example.models.OrderDetailId;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDetailsRepository extends GenericRepository<OrderDetail, OrderDetailId> {
}
