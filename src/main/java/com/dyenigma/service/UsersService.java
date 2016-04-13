package com.dyenigma.service;

import com.dyenigma.entity.Users;
import com.dyenigma.utils.PageUtil;

import java.util.List;

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

    /**
     * 分页查询用户信息
     * param pageUtil
     * return
     */
    List<Users> allUserByPage(PageUtil pageUtil);


}