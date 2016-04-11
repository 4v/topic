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

    List<Permission> findAllByRoleId(int roleId);

    boolean savePermission(int roleId,String checkedIds);
}
