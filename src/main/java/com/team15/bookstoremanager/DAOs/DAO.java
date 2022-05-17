package com.team15.bookstoremanager.DAOs;

import java.util.List;

public interface DAO<T> {
    List<T> getALl();

    boolean create();

    T getById(int id);

    boolean update(int T, T newObj);

    boolean delete(T obj);
}
