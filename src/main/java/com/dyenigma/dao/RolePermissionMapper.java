package com.dyenigma.dao;

import com.dyenigma.entity.RolePermission;

import java.util.List;

/**
 * topic 角色权限映射
 * author: dyenigma
 * create: 2016/4/8 9:30
 */
public interface RolePermissionMapper extends BaseMapper<RolePermission> {
    /**
     * 根据角色ID查询所有的映射信息，用于角色管理菜单中勾选treeGrid
     * param roleId
     * return
     */
    List<RolePermission> findAllByRoleId(int roleId);

    /**
     * 查找所有的有映射记录的角色信息，用于自动分配新增加的默认权限菜单
     * return
     */
    List<Integer> findAllRoleId();

    /**
     * 查找所有的映射菜单记录，用于判断某个菜单是否能删除
     * param permissionId
     * return
     */
    List<Integer> findAllByPermissionId(int permissionId);
}
