package com.example.funitureshopversion2.obj;

public class Shop {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String openInfo;

    public Shop(String id, String name, String address, String phone, String email, String openInfo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.openInfo = openInfo;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", openInfo='" + openInfo + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getOpenInfo() {
        return openInfo;
    }
}
