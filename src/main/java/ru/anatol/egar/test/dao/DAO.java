/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.anatol.egar.test.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Анатолий
 */
public class DAO {
    private static DAO instance;
//    EntityManagerFactory entityManagerFactory;

    private DAO() {
//        entityManagerFactory = Persistence.createEntityManagerFactory("EGAR-TEST_PU");
    }

    public static DAO getInstance() {
        if (instance == null) {
            instance = new DAO();
        }
        return instance;
    }
    
    private ProductDAO productDAO;

    public ProductDAO getProductDAO() {
        if (productDAO == null) {
//            productDAO = new ProductDAO(entityManagerFactory);
            productDAO = new ProductDAO();
        }
        return productDAO;
    }
}
