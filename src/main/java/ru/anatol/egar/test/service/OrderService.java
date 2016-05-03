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
import ru.anatol.egar.test.entity.Order;

/**
 *
 * @author Анатолий
 */
@ManagedBean(name = "orderService")
@ApplicationScoped
public class OrderService {

    public List<Order> orders() {
        return DAO.getInstance().getOrderDAO().findAll();
    }

    public void save(Order order) throws Exception {
        if (order == null) {
            throw new IllegalArgumentException("order = null");
        }
        if (order.getId() == null) {
            DAO.getInstance().getOrderDAO().create(order);
        } else {
            DAO.getInstance().getOrderDAO().edit(order);
        }

    }

    public void remove(Order order) throws Exception {
        if (order == null) {
            throw new IllegalArgumentException("order = null");
        }
        if (order.getId() == null) {
            throw new IllegalArgumentException("order.id = null");
        }
        DAO.getInstance().getOrderDAO().remove(order);
    }

}
