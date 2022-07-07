package com.example.funitureshopversion2.obj;

import java.util.List;

public class Product {
    private String id;
    private String name;
    private String cover;
    private List<String> images;
    private double price;
    private double discount;
    private int stock;
    private int sold;
    private String category;
    private double width;
    private double height;
    private double depth;
    private double weight;
    private String material;
    private String origin;
    private String description;

    public Product(String id, String name,
                   String cover,List<String> images, double price, double discount,
                   int stock, int sold, String category, double width, double height,
                   double depth, double weight, String material, String origin, String description){
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.images = images;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.sold = sold;
        this.category = category;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.material = material;
        this.origin = origin;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", stock=" + stock +
                ", sold=" + sold +
                ", category='" + category + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", origin='" + origin + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCover() {
        return cover;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public int getSold() {
        return sold;
    }

    public String getCategory() {
        return category;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDescription() {
        return description;
    }
}
