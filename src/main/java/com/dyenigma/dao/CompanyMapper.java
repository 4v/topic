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

    /**
     * 分页查询公司信息
     * param pageUtil
     * return
     */
    List<Company> findAllByPage(PageUtil pageUtil);

    /**
     * 组织信息添加时用到，公司信息下拉框数据生成
     * return
     */
    List<Company> findSuperComp();

}
