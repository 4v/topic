/**
 * @Title: MgrUserController.java
 * @Package com.dyenigma.controller
 * @author dingdongliang
 * @date 2015年10月26日 下午2:49:45
 * @version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.controller;

import com.dyenigma.entity.Users;
import com.dyenigma.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: MgrUserController
 * @Description: 用户管理控制类（跳转和业务控制）
 * @author dingdongliang
 * @date 2015年10月26日 下午2:49:45
 *
 */
@Controller
@RequestMapping(value = "/manage/users")
public class MgrUsersController extends BaseController {
    private final Logger LOGGER = LoggerFactory.getLogger(MgrUsersController.class);

    @Autowired
    private UsersService usersService;

    @RequestMapping("/usersMain")
    public String main() {
        LOGGER.debug("main() is executed!");
        return "manage/users/usersMain";
    }

    /**
     *
     * @Title: findAllOrganList
     * @Description: 查询所有用户
     * @param @param request
     * @param @return 参数
     * @return List<Organization> 返回类型
     * @throws
     */
    @ResponseBody
    @RequestMapping(value = "/findAllUserList", produces = "application/json;charset=utf-8")
    public List<Users> findAllUserList() {
        return usersService.findAll();
    }
}
