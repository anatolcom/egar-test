package ru.anatol.egar.test.view;

import ru.anatol.egar.test.service.ProductService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import ru.anatol.egar.test.entity.Product;

/**
 *
 * @author Анатолий
 */
@ManagedBean(name = "dtProductList")
@ViewScoped
public class ProductListView {

    private List<Product> products;

    @ManagedProperty("#{productService}")
    private ProductService service;

    @PostConstruct
    public void init() {
        products = service.products();
    }

    private Product selected;

    public List<Product> getProducts() {
        return products;
    }

    public void setService(ProductService service) {
        this.service = service;
    }

    public Product getSelected() {
        return selected;
    }

    public void setSelected(Product selected) {
        this.selected = selected;
    }

    public Product newProduct() {
        return new Product();
    }

    public void saveSelected() {
        try {
            System.out.println("save: " + selected);
            service.save(selected);
            products = service.products();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void removeSelected() {
        try {
            System.out.println("remove: " + selected);
            service.remove(selected);
            products = service.products();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void remove(Product product) {
        try {
            System.out.println("remove: " + selected);
            service.remove(product);
            products = service.products();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
