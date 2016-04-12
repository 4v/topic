package com.dyenigma.service;

import com.dyenigma.entity.Users;

public interface UsersService extends BaseService<Users> {
    /**
     * 根据名字查询用户,用于shiro权限控制
     * param name
     * return
     */
    Users getUserByName(String name);

    /**
     * 持久化用户信息
     * param user
     * return
     */
    boolean persistenceUser(Users user);
}