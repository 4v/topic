package com.dyenigma.service.impl;

import com.dyenigma.entity.Permission;
import com.dyenigma.entity.Role;
import com.dyenigma.entity.RolePermission;
import com.dyenigma.service.RolePermissionService;
import com.dyenigma.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * topic
 * author: dyenigma
 * create: 2016/4/8 9:23
 */
@Transactional
@Service("rolePermissionService")
public class RolePermissionServiceImpl extends BaseServiceImpl<RolePermission> implements RolePermissionService {

    private final Logger LOGGER = LoggerFactory.getLogger(RolePermissionServiceImpl.class);

    @Override
    public List<Permission> findAllByRoleId(int roleId) {
        LOGGER.info("开始读取id为" + roleId + "的角色权限信息");
        List<Permission> permissions = new ArrayList<>();
        List<Integer> idList = rolePermissionMapper.findAllByRoleId(roleId);
        for (Integer i : idList) {
            Permission permission = new Permission();
            permission.setPermissionId(i);
            permissions.add(permission);
        }
        return permissions;
    }

    /**
     * 保存选取的权限与角色映射
     * param roleId
     * param checkedIds
     * return
     */
    @Override
    public boolean savePermission(int roleId, String checkedIds) {
        Integer userId = Constants.getCurrendUser().getUserId();
        Role role = roleMapper.findById(roleId);

        Map<String, RolePermission> map = new HashMap<>();
        Set<RolePermission> rolePermissions = role.getRolePermissions();
        for (RolePermission rolePermission : rolePermissions) {
            Integer permissionId = rolePermission.getPermission().getPermissionId();
            map.put(permissionId.toString(), rolePermission);
            updRolePermission(userId, rolePermission, Constants.PERSISTENCE_DELETE_STATUS);
        }
        if (null != checkedIds && !"".equals(checkedIds)) {
            String[] ids = checkedIds.split(",");
            for (String id : ids) {
                RolePermission rolePermission = map.get(id);
                if (rolePermission != null) {
                    updRolePermission(userId, rolePermission, Constants.PERSISTENCE_STATUS);
                } else {
                    Permission permission = permissionMapper.findById(Integer.valueOf(id));
                    Date date = new Date();
                    rolePermission = new RolePermission();
                    rolePermission.setCreated(date);
                    rolePermission.setLastmod(date);
                    rolePermission.setStatus(Constants.PERSISTENCE_STATUS);
                    rolePermission.setCreater(userId);
                    rolePermission.setModifyer(userId);
                    rolePermission.setPermission(permission);
                    rolePermission.setRole(role);

                    rolePermissionMapper.insert(rolePermission);
                }
            }
        }
        return true;
    }

    private void updRolePermission(Integer userId, RolePermission rolePermission, String status) {
        rolePermission.setLastmod(new Date());
        rolePermission.setCreater(userId);
        rolePermission.setModifyer(userId);
        rolePermission.setStatus(status);
        rolePermissionMapper.update(rolePermission);
    }

}
