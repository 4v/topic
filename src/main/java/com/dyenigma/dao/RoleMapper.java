package com.dyenigma.dao;

import com.dyenigma.entity.Role;
import com.dyenigma.utils.PageUtil;

import java.util.List;

/**
 * topic
 * author: dyenigma
 * create: 2016/4/8 9:30
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 好名字自己会说话
     * param pageUtil
     * return
     */
    List<Role> findAllByPage(PageUtil pageUtil);
}
