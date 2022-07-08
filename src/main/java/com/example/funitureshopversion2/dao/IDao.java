package com.example.funitureshopversion2.dao;

import java.util.List;

public interface IDao<T> {
    T get(String id);
    boolean save(T t);
    boolean update(T t, T nt);
    boolean remove(T t);
    List<T> getAll();
}
