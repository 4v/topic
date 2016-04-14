package com.dyenigma.service.impl;

import com.dyenigma.entity.BaseDomain;
import com.dyenigma.entity.UserRole;
import com.dyenigma.entity.Users;
import com.dyenigma.service.UsersService;
import com.dyenigma.utils.Constants;
import com.dyenigma.utils.PageUtil;
import com.dyenigma.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("usersService")
public class UsersServiceImpl extends BaseServiceImpl<Users> implements UsersService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsersService.class);

    @Override
    public List<Users> findAll() {
        LOGGER.debug("run the users findall");
        return usersMapper.findAll();
    }

    @Override
    public Users getUserByName(String name) {

        return usersMapper.findByName(name);
    }

    @Override
    public boolean persistenceUser(Users user) {
        Integer userId = Constants.getCurrendUser().getUserId();

        if (StringUtil.isEmpty(user.getUserId() + "")) {
            BaseDomain.createLog(user, userId);
            user.setStatus(Constants.PERSISTENCE_STATUS);
            usersMapper.insert(user);
        } else {
            BaseDomain.editLog(user, userId);
            usersMapper.update(user);
        }
        return true;
    }

    /**
     * 分页查询用户信息
     * param pageUtil
     * return
     * param pageUtil
     */
    @Override
    public List<Users> allUserByPage(PageUtil pageUtil) {
        LOGGER.info("开始查找用户信息,分页显示");
        List<Users> userList = usersMapper.findAllByPage(pageUtil);
        return userList;
    }

    @Override
    public boolean delUser(int userId) {
        List<UserRole> urList = userRoleMapper.findAllByUserId(userId);
        return usersMapper.delete(userId) > 0;
    }
}
