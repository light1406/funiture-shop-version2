package com.example.funitureshopversion2.obj;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Product p1 = new Product("01", "ghe", null, null, 100.0,
                0.2, 10, 40,"bedroom", 1,1,1,
                1,"wood", "japan", "nothing");
        Product p2 = new Product("02", "ban", null, null, 200.0,
                0.2, 10, 40,"bedroom", 1,1,1,
                1,"wood", "japan", "nothing");
        List<ProductItem> items = new ArrayList<>();
        items.add(new ProductItem(p1, 2));
        items.add(new ProductItem(p2, 3));
        Order order = new Order("01", "Nguyen Van A", "0123", "TP.HCM", "Sending",
                new Date(), items);
        System.out.println(order.getTotal());
    }
}
