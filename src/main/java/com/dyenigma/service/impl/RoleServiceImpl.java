package com.dyenigma.service.impl;

import com.dyenigma.entity.Role;
import com.dyenigma.service.RoleService;
import com.dyenigma.utils.Constants;
import com.dyenigma.utils.PageUtil;
import com.dyenigma.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * topic
 * author: dyenigma
 * create: 2016/4/8 9:23
 */
@Transactional
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

    private final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Override
    public List<Role> findAllRoleList(PageUtil pageUtil) {
        LOGGER.info("开始查找用户信息,分页显示");
        List<Role> roleList = roleMapper.findAllByPage(pageUtil);
        return roleList;
    }

    @Override
    public Long getCount(Map<String, Object> paramMap) {
        LOGGER.info("开始查找用户信息的总条数");
        return roleMapper.getCount(paramMap);
    }

    @Override
    public boolean persistenceRole(Role role) {
        Integer userId = Constants.getCurrendUser().getUserId();

        if (StringUtil.isEmpty(role.getRoleId() + "")) {
            role.setCreater(userId);
            role.setLastmod(new Date());
            role.setCreated(new Date());
            role.setModifyer(userId);
            role.setStatus(Constants.PERSISTENCE_STATUS);
            roleMapper.insert(role);

            //TODO  这里设置新增用户的默认权限
        } else {
            role.setLastmod(new Date());
            role.setModifyer(userId);
            roleMapper.update(role);
        }
        return true;
    }

    @Override
    public int delete(int id) {
        //TODO 删除角色
        //TODO 删除角色权限表记录
        //TODO 出现问题全部回滚,返回删除失败
        return roleMapper.delete(id);
    }

}
