package com.dyenigma.dao;

import com.dyenigma.entity.Users;
import com.dyenigma.utils.PageUtil;

import java.util.List;

/**
 * author:dingdongliang
 * time: 2015/10/8 9:31
 */
public interface UsersMapper extends BaseMapper<Users> {

    Users findByName(String name);

    /**
     * 好名字自己会说话
     * param pageUtil
     * return
     */
    List<Users> findAllByPage(PageUtil pageUtil);
}
