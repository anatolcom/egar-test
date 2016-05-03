package ru.anatol.egar.test.dao;

import ru.anatol.egar.test.entity.Order;

/**
 * @author Анатолий
 */
public class OrderDAO extends AbstractDAO<Order> {

    public OrderDAO() {
        super(Order.class);
    }

}
