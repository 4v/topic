package com.dyenigma.dao;

import com.dyenigma.entity.UserRole;

import java.util.List;

/**
 * author:dingdongliang
 * time: 2015/10/8 9:31
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<Integer> findAllByUserId(int userId);

}
