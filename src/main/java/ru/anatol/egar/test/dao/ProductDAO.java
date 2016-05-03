package ru.anatol.egar.test.dao;

import ru.anatol.egar.test.entity.Product;

/**
 * @author Анатолий
 */
public class ProductDAO extends AbstractDAO<Product> {

    public ProductDAO() {
        super(Product.class);
    }

}
