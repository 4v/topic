package com.dyenigma.dao;

import java.util.List;

public interface BaseMapper<T> {
    int insert(T t);

    int update(T t);

    int delete(long id);

    T findById(long id);

    List<T> findAll();
}
