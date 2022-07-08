package com.example.funitureshopversion2.obj;

public class ProductItem {
    private Product product;
    private int quantity;

    public ProductItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public boolean isProduct(String id){
        return this.product.isProduct(id);
    }

    public void increaseQuantity(){
        this.quantity+=1;
    }

    public double getPrice(){
        return product.getPrice() * (1 - product.getDiscount()) * quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
