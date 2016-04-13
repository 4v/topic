package com.dyenigma.service.impl;

import com.dyenigma.entity.Role;
import com.dyenigma.entity.UserRole;
import com.dyenigma.entity.Users;
import com.dyenigma.service.UserRoleService;
import com.dyenigma.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * topic
 * author: dyenigma
 * create: 2016/4/13 9:27
 */
@Transactional
@Service("userRoleService")
public class UserRoleServiceImpl extends BaseServiceImpl<UserRole> implements UserRoleService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserRoleServiceImpl.class);

    /**
     * 好代码自己会说话
     * param roleId
     * return
     *
     * @param userId
     */
    @Override
    public List<Role> findAllByUserId(int userId) {
        LOGGER.info("开始读取id为" + userId + "的用户信息");
        List<Role> rList = new ArrayList<>();
        List<Integer> idList = userRoleMapper.findAllByUserId(userId);
        for (Integer i : idList) {
            Role role = new Role();
            role.setRoleId(i);
            rList.add(role);
        }
        return rList;
    }

    /**
     * 保存分配角色权限
     * param roleId 角色id
     * param checkedIds 菜单权限ID集合
     * return
     * param userId
     * param checkedIds
     */
    @Override
    public boolean saveRole(int userId, String checkedIds) {
        Integer currentUserId = Constants.getCurrendUser().getUserId();

        Users user = usersMapper.findById(userId);
        Set<UserRole> set = user.getUserRoles();
        Map<Integer, UserRole> map = new HashMap<>();
        for (UserRole userRole : set) {
            map.put(userRole.getRole().getRoleId(), userRole);
            userRole.setLastmod(new Date());
            userRole.setStatus(Constants.PERSISTENCE_DELETE_STATUS);
            userRoleMapper.update(userRole);
        }
        if (!"".equals(checkedIds) && checkedIds.length() != 0) {
            String[] ids = checkedIds.split(",");

            for (String id : ids) {
                Integer tempId = Integer.valueOf(id);
                Role role = roleMapper.findById(tempId);
                UserRole userRole;
                if (map.containsKey(tempId)) {
                    userRole = map.get(tempId);
                    userRole.setStatus(Constants.PERSISTENCE_STATUS);
                    userRole.setCreater(currentUserId);
                    userRole.setModifyer(currentUserId);
                    userRoleMapper.update(userRole);
                } else {
                    userRole = new UserRole();
                    userRole.setCreated(new Date());
                    userRole.setLastmod(new Date());
                    userRole.setRole(role);
                    userRole.setUsers(user);
                    userRole.setCreater(currentUserId);
                    userRole.setModifyer(currentUserId);
                    userRole.setStatus(Constants.PERSISTENCE_STATUS);
                    userRoleMapper.insert(userRole);
                }
            }
        }
        return true;
    }
}
