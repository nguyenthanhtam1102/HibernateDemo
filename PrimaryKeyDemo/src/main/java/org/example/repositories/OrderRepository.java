package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.models.Order;
import org.example.models.OrderId;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class OrderRepository extends GenericRepository<Order, OrderId> {

    public Order findById2(long id1, UUID id2) {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            TypedQuery<Order> query = em.createQuery("select o from Order o where o.id = :id1", Order.class);
            query.setParameter("id1", id1);
            return query.getSingleResult();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
