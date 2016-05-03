/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.anatol.egar.test.dao;

import java.util.List;
import org.hibernate.Session;
import ru.anatol.egar.test.HibernateUtil;

/**
 *
 * @author Анатолий
 * @param <T>
 */
public abstract class AbstractDAO<T> {

    private final Class<T> entityClass;

    public AbstractDAO(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public Session getSession() {
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public void create(T entity) throws Exception {
        getSession().getTransaction().begin();
        getSession().persist(entity);
        getSession().getTransaction().commit();
    }

    public void edit(T entity) {
        getSession().getTransaction().begin();
        getSession().update(entity);
        getSession().getTransaction().commit();
    }

    public void remove(T entity) {
        getSession().getTransaction().begin();
        getSession().delete(entity);
        getSession().getTransaction().commit();
    }

    /*    public T find(Object id) {
     //        return getEntityManager().find(entityClass, id);
     EntityManager em = emf.createEntityManager();
     T find = em.find(entityClass, id);
     em.close();
     return find;
     }*/
    
    public List<T> findAll() {
        getSession().getTransaction().begin();
        List<T> list = (List<T>) getSession().createCriteria(entityClass).list();
        getSession().getTransaction().commit();
        return list;
    }
}
