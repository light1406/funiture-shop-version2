package com.example.funitureshopversion2.obj;

import java.util.Iterator;
import java.util.List;

public class ShopCart {
    private List<ProductItem> items;

    public ShopCart(List<ProductItem> items) {
        this.items = items;
    }

    public void add(Product product) {
        for (ProductItem item : items) {
            if (item.isProduct(product.getId())) {
                item.increaseQuantity();
            }
        }
        items.add(new ProductItem(product, 1));
    }

    public void remove(Product product) {
        Iterator<ProductItem> iterator = items.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isProduct(product.getId()))
                iterator.remove();
        }
    }

    public double getTotalAll() {
        return items.stream().mapToDouble(i -> i.getPrice()).sum();
    }

    public double getTotal(List<ProductItem> items){
        return items.stream().mapToDouble(i -> i.getPrice()).sum();
    }
}
