package com.dyenigma.service.impl;

import com.dyenigma.entity.Users;
import com.dyenigma.service.UsersService;
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

}
