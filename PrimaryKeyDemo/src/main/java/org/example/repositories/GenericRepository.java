package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.example.utils.DatabaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Component
public abstract class GenericRepository<T, D> {

    @Autowired
    protected DatabaseUtils databaseUtils;

    private Class<T> tClass;

    public GenericRepository() {
        tClass = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T save(T t) {
        EntityManager em = databaseUtils.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(t);
            transaction.commit();
            return t;
        } catch (Exception ex) {
            transaction.rollback();
            throw new RuntimeException(ex);
        } finally {
            em.close();
        }
    }

    public T update(T t) {
        EntityManager em = databaseUtils.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            T result = em.merge(t);
            transaction.commit();
            return result;
        } catch (Exception ex) {
            transaction.rollback();
            throw new RuntimeException(ex);
        } finally {
            em.close();
        }
    }

    public T findById(D d) {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            return em.find(tClass, d);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            em.close();
        }
    }

    public List<T> findAll() {
        EntityManager em = databaseUtils.getEntityManager();
        try {
            return em.createQuery("FROM " + tClass.getName(), tClass).getResultList();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        } finally {
            em.close();
        }
    }

    public void remove(T t) {
        EntityManager em = databaseUtils.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.remove(em.contains(t) ? t : em.merge(t));
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
            throw new RuntimeException(ex);
        } finally {
            em.close();
        }
    }

}
