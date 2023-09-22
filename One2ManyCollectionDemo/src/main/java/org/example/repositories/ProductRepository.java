package org.example.repositories;

import jakarta.persistence.EntityManager;
import org.example.models.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository extends GenericRepository<Product, Long> {

    public List<Product> findProductsSQL() {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            return em.createNativeQuery("select top 10 from products", Product.class).getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Product> findProductsHQL() {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            return em.createQuery("select p from Product p").getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
