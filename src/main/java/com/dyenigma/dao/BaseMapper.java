package com.dyenigma.dao;

import java.util.List;

public interface BaseMapper<T> {
    int insert(T t);

    int update(T t);

    int delete(int id);

    T findById(int id);

    List<T> findAll();
}
