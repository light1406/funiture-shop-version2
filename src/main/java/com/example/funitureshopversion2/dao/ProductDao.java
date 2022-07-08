package com.example.funitureshopversion2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

public class ProductDao implements IDao{

    private Connection connection;
    private PreparedStatement preparedStatement;

    private static ProductDao instance;

    private ProductDao(){
        
    }

    public static ProductDao getInstance(){
        if (instance == null)
            instance = new ProductDao();
        return instance;
    }

    @Override
    public Object get(String id) {
        return null;
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean update(Object o, Object nt) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public List getAll() {
        return null;
    }
}
