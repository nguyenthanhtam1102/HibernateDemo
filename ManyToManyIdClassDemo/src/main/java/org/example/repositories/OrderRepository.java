package org.example.repositories;

import org.example.models.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends GenericRepository<Order, Long> {
}
