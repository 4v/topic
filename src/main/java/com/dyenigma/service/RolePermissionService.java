package com.dyenigma.service;

import com.dyenigma.entity.Permission;
import com.dyenigma.entity.RolePermission;

import java.util.List;

/**
 * topic
 * author: dyenigma
 * create: 2016/4/8 9:22
 */
public interface RolePermissionService extends BaseService<RolePermission> {

    /**
     * 好代码自己会说话
     * param roleId
     * return
     */
    List<Permission> findAllByRoleId(int roleId);

    /**
     * 保存分配角色权限
     * param roleId 角色id
     * param checkedIds 菜单权限ID集合
     * return
     */
    boolean savePermission(int roleId, String checkedIds);

}
