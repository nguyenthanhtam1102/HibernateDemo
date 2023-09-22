package org.example.repositories;

import jakarta.persistence.EntityManager;
import org.example.mappers.OrderMapper;
import org.example.models.Order;
import org.example.models.dtos.OrderDTO;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends GenericRepository<Order, Long> {

    public OrderDTO getOrderById(long id) {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            Order order = findById(id);
            if(order == null)
                return null;
            return OrderMapper.toOrderDTO(order);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
