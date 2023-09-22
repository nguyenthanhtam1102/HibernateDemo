package org.example.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseUtils {

    @Value("jpa.persistence_unit.name")
    private String persistenceUnitName;

    private EntityManagerFactory entityManagerFactory;

    public DatabaseUtils() {
        entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
    }

    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    public EntityManager getEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }

}
