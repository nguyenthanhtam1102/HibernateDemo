package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.example.models.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonRepository extends GenericRepository<Person, Integer> {

    public List<Person> findByDepartment(String department) {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            TypedQuery<Person> query = em.createQuery(
                    "select e from Employee e where e.department = :department",
                    Person.class
            );
            query.setParameter("department", department);
            return query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Person> findByShippingAddress(String shippingAddress) {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            Query query = em.createQuery(
                    "select c from Customer c where c.shippingAddress = :shippingAddress",
                    Person.class
            );
            query.setParameter("shippingAddress", shippingAddress);
            return query.getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
