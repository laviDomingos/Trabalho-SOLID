package org.example.model;

import org.example.Costumer;

import java.util.List;

public class Order {

    private int id;
    private Costumer costumer;
    private List<OrderItem> items;

    public Order(int id, Costumer costumer, List<OrderItem> items) {
        this.id = id;
        this.costumer = costumer;
        this.items = items;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Costumer getCustomer() {
        return costumer;
    }
}
