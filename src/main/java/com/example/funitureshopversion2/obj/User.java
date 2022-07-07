package com.example.funitureshopversion2.obj;

public class User {
    private String id;
    private String username;
    private String password;
    private String name;
    private String birthDay;
    private String email;
    private String phone;
    private String address;
    private int role;

    public User(){}

    public User(String id, String username, String password,
                String name, String birthDay, String email,
                String phone, String address, int role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthDay = birthDay;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getRole() {
        return role;
    }
}
