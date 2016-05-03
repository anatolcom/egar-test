/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.anatol.egar.test.service;

import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import ru.anatol.egar.test.dao.DAO;
import ru.anatol.egar.test.entity.Product;

/**
 *
 * @author Анатолий
 */
@ManagedBean(name = "productService")
@ApplicationScoped
public class ProductService {

    public List<Product> products() {
        return DAO.getInstance().getProductDAO().findAll();
    }

    public void save(Product product) throws Exception {
        if (product == null) {
            throw new IllegalArgumentException("product = null");
        }
        if (product.getId() == null) {
            DAO.getInstance().getProductDAO().create(product);
        } else {
            DAO.getInstance().getProductDAO().edit(product);
        }

    }

    public void remove(Product product) throws Exception {
        if (product == null) {
            throw new IllegalArgumentException("product = null");
        }
        if (product.getId() == null) {
            throw new IllegalArgumentException("product.id = null");
        }
        DAO.getInstance().getProductDAO().remove(product);
    }

}
