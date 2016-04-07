package com.dyenigma.dao;

import com.dyenigma.entity.Company;
import com.dyenigma.utils.PageUtil;

import java.util.List;

/**
 * topic
 * author Dyenigma
 * create 2016/4/4 15:22
 */
public interface CompanyMapper extends BaseMapper<Company> {

    List<Company> findAllByPage(PageUtil pageUtil);
    
    List<Company> findSuperComp();

}
