package com.dyenigma.dao;

import com.dyenigma.entity.Users;

public interface UsersMapper extends BaseMapper<Users> {

    Users findByName(String name);

}
