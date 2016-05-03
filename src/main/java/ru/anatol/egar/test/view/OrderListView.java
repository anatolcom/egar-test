package ru.anatol.egar.test.view;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;
import ru.anatol.egar.test.entity.Order;
import ru.anatol.egar.test.service.OrderService;

/**
 *
 * @author Анатолий
 */
@ManagedBean(name = "dtOrderList")
@ViewScoped
public class OrderListView {

    public void test(ActionEvent actionEvent) {
        System.out.println("--- test ---");
//        try {
//            Order order = new Order();
//            order.setCreated(new Date());
//            DAO.getInstance().getOrderDAO().create(order);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

    private List<Order> orders;

    @ManagedProperty("#{orderService}")
    private OrderService service;

    @PostConstruct
    public void init() {
        orders = service.orders();
    }

    private Order selected;

    public List<Order> getOrders() {
        return orders;
    }

    public void setService(OrderService service) {
        this.service = service;
    }
    
    public Order getSelected() {
        return selected;
    }

    public void setSelected(Order selected) {
        this.selected = selected;
    }

}
