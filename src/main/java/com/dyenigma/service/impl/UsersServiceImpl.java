package com.dyenigma.service.impl;

import com.dyenigma.entity.Users;
import com.dyenigma.service.UsersService;
import com.dyenigma.utils.Constants;
import com.dyenigma.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
            user.setLastmod(new Date());
            user.setCreated(new Date());
            user.setCreater(userId);
            user.setModifyer(userId);
            user.setStatus(Constants.PERSISTENCE_STATUS);
            usersMapper.insert(user);
		} else {
			user.setLastmod(new Date());
			user.setModifyer(userId);
			usersMapper.update(user);
		}
		return true;
	}

}
