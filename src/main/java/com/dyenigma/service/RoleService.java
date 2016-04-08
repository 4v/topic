package com.dyenigma.service;

import com.dyenigma.entity.Role;
import com.dyenigma.utils.PageUtil;

import java.util.List;

/**
 * topic
 * author: dyenigma
 * create: 2016/4/8 9:22
 */
public interface RoleService extends BaseService<Role> {
    List<Role> findAllRoleList(PageUtil pageUtil);

    boolean persistenceRole(Role role);
}
