/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.anatol.egar.test.dao;

//import javax.persistence.EntityManagerFactory;
import ru.anatol.egar.test.entity.Product;

/**
 *
 * @author Анатолий
 */
public class ProductDAO extends AbstractDAO<Product> {

//    public ProductDAO(EntityManagerFactory emf) {
//        super(Product.class, emf);
//    }
    public ProductDAO() {
        super(Product.class);
    }

}
