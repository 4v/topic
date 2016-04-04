package com.dyenigma.service;

import java.util.List;

public interface BaseService<T> {

    int insert(T t);

    int update(T t);

    int delete(int id);

    T findById(int id);

    List<T> findAll();
}
