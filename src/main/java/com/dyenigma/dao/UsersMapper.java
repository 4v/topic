package com.dyenigma.dao;

import com.dyenigma.entity.Users;

/**
 * author:dingdongliang
 * time: 2015/10/8 9:31
 */
public interface UsersMapper extends BaseMapper<Users> {

    Users findByName(String name);

}
