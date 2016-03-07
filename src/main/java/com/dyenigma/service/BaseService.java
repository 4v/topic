package com.dyenigma.service;

import java.util.List;

public interface BaseService<T> {

    int insert(T t);

    int update(T t);

    int delete(long id);

    T findById(long id);

    List<T> findAll();
}
