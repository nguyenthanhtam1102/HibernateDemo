package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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

    public List<Product> findProductByName(String name) {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            TypedQuery<Product> query = em.createNamedQuery("Product_FindProductByName", Product.class);
            query.setParameter("name", name);
            return query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Product> searchProduct(String name, long id) {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            TypedQuery<Product> query = em.createNamedQuery("Product_SearchProduct", Product.class);
            query.setParameter("name", "%" + name + "%");
            query.setParameter("id", id);
            return query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
