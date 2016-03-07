/**
 * @Title: PermissionMapper.java
 * @Package com.dyenigma.dao
 * @author dingdongliang
 * @date 2015年9月14日 下午4:17:46
 * @version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.dao;

import com.dyenigma.entity.Permission;

import java.util.List;

/**
 * @ClassName: PermissionMapper
 * @Description: 权限表查询类
 * @author dingdongliang
 * @date 2015年9月14日 下午4:17:46
 *
 */

public interface PermissionMapper extends BaseMapper<Permission> {
    /**
     *
     * @Title: adminMenu
     * @Description: 超级管理员权限查询，type标志查询是菜单项(F)还是操作项(O)
     * @param @param type
     * @param @return 参数
     * @return List<Permission> 返回类型
     * @throws
     */
    List<Permission> adminMenu(String type);

    /**
     *
     * @Title: usersMenu
     * @Description: 普通用户权限查询，type标志查询是菜单项(F)还是操作项(O)
     * @param @param userId
     * @param @param type
     * @param @return 参数
     * @return List<Permission> 返回类型
     * @throws
     */
    List<Permission> usersMenu(int userId, String type);

    /**
     *
     * @Title: findByPid
     * @Description: 查询某个父菜单的子项
     * @param @param pid
     * @param @return 参数
     * @return List<Permission> 返回类型
     * @throws
     */
    List<Permission> findByPid(int pid);

    /**
     *
     * @Title: updateById
     * @Description: 更新权限信息为过期
     * @param @param id
     * @param @return 参数
     * @return int 返回类型
     * @throws
     */
    int updateById(int id);

    /**
     *
     * @Title: findSuperFunc
     * @Description: 获取所有可添加子项的权限信息
     * @param @return 参数
     * @return List<Permission> 返回类型
     * @throws
     */
    List<Permission> findSuperFunc();
}
