package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.PersistenceContext;
import org.example.models.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends GenericRepository<Order, Long> {

}
