/**
 * Title: OrganMapper.java
 * Package com.dyenigma.dao
 * author dingdongliang
 * date 2015年10月10日 上午11:41:43
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.dao;

import com.dyenigma.entity.Organization;

import java.util.List;

/**
 * author dingdongliang
 * ClassName: OrganMapper
 * Description: 组织表查询类
 * date 2015年10月10日 上午11:41:43
 */

public interface OrganizationMapper extends BaseMapper<Organization> {
    /**
     * param    pid
     * param return 参数
     * return List<Organization> 返回类型
     * throws
     * Title: findByPid
     * Description: 查询某个父组织的子项
     */
    List<Organization> findByPid(int pid);

    /**
     * param    id
     * param return 参数
     * return int 返回类型
     * throws
     * Title: updateById
     * Description: 更新组织信息为过期
     */
    int updateById(int id);

    /**
     * param return 参数
     * return List<Organization> 返回类型
     * throws
     * Title: findSuperOrgan
     * Description: 获取所有可添加子项的组织信息
     */
    List<Organization> findSuperOrgan();

    /**
     * 查找某个公司下面的所有组织信息
     * param companyId
     * return
     */
    List<Organization> findByCompId(int companyId);
}
