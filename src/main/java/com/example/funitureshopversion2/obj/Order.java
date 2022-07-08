package com.example.funitureshopversion2.obj;

import java.util.Date;
import java.util.List;

public class Order {
    private String id;
    private String name;
    private String phone;
    private String address;
    private String status;
    private Date orderDate;
    private List<ProductItem> items;

    public Order(String id, String name, String phone,
                 String address, String status, Date orderDate,
                 List<ProductItem> items) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.orderDate = orderDate;
        this.items = items;
    }

    public double getTotal(){
        return items.stream().mapToDouble(i -> i.getPrice()).sum();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public List<ProductItem> getItems() {
        return items;
    }
}
