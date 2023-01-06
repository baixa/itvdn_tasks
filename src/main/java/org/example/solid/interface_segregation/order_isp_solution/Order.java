package org.example.solid.interface_segregation.order_isp_solution;

public class Order {

    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
