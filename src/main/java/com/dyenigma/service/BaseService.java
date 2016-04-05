package com.dyenigma.service;

import java.util.List;
import java.util.Map;

public interface BaseService<T> {

    int insert(T t);

    int update(T t);

    int delete(int id);

    T findById(int id);

    List<T> findAll();

    Long getCount(Map<String,Object> paramMap);
}
