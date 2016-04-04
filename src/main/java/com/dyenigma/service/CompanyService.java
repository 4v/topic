package com.dyenigma.service;

import com.dyenigma.dao.BaseMapper;
import com.dyenigma.entity.Company;

import java.util.List;

/**
 * topic
 * author Dyenigma
 * create 2016/4/4 14:23
 */
public interface CompanyService extends BaseMapper<Company> {

    /**
     * 查找所有的公司信息
     * param param
     * param pageUtil
     * return
     */
    List<Company> findComp(String compId);

    /**
     * 分页总数
     * <p>
     * param param
     * param pageUtil
     * return
     */
    Long getCount();

    /**
     * 根据ID删除公司信息
     * <p>
     * param compId
     * return
     */
    boolean delComp(String compId);

    /**
     * 持久化公司信息，根据ID判断是insert还是update
     * <p>
     * param company
     * return
     */
    boolean persistenceComp(Company company);


}
