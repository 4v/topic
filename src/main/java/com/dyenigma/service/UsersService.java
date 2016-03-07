package com.dyenigma.service;

import com.dyenigma.entity.Users;

public interface UsersService extends BaseService<Users> {
    Users getUserByName(String name);
}