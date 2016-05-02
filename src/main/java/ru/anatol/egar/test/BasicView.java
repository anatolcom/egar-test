/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.anatol.egar.test;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ActionEvent;
import ru.anatol.egar.test.dao.DAO;
import ru.anatol.egar.test.entity.Product;

/**
 *
 * @author Анатолий
 */
@ManagedBean
public class BasicView {

    private String text = "";

    public void test(ActionEvent actionEvent) {
        setText(text + " | test");
        try {
            Product product = new Product();
            product.setName(text);
            DAO.getInstance().getProductDAO().create(product);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        System.out.println("text: " + text);
        this.text = text;
    }
}
