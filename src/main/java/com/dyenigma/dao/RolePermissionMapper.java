package com.dyenigma.dao;

import com.dyenigma.entity.RolePermission;

import java.util.List;

/**
 * topic
 * author: dyenigma
 * create: 2016/4/8 9:30
 */
public interface RolePermissionMapper extends BaseMapper<RolePermission> {
    List<Integer> findAllByRoleId(int roleId);
}
