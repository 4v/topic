/**
 * Title: MgrUserController.java
 * Package com.dyenigma.controller
 * author dingdongliang
 * date 2015年10月26日 下午2:49:45
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.controller;

import com.alibaba.fastjson.JSONArray;
import com.dyenigma.entity.Users;
import com.dyenigma.model.Json;
import com.dyenigma.service.UsersService;
import com.dyenigma.utils.Constants;
import com.dyenigma.utils.StringUtil;
import com.dyenigma.utils.security.Md5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * ClassName: MgrUserController
 * Description: 用户管理控制类（跳转和业务控制）
 * author dingdongliang
 * date 2015年10月26日 下午2:49:45
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
     * Title: findAllOrganList
     * Description: 查询所有用户
     * param   request
     * param return 参数
     * return List<Organization> 返回类型
     * throws
     */
    @ResponseBody
    @RequestMapping(value = "/findAllUserList", produces = "application/json;charset=utf-8")
    public List<Users> findAllUserList() {
        return usersService.findAll();
    }

    @RequestMapping("/usersEditDlg")
    public String usersEditDlg() {
        LOGGER.debug("usersEditDlg() is executed!");
        return "manage/users/usersEditDlg";
    }

    /**
     * param    request
     * param return 参数
     * return String 返回类型
     * throws
     * Title: saveOrUpdateUser
     * Description: 新增程式或者更新组织处理
     */
    @ResponseBody
    @RequestMapping(value = "/saveOrUpdateUser", produces = "application/json;charset=utf-8")
    public String saveOrUpdateUser(HttpServletRequest request) {
        Users user = new Users();

        String status = request.getParameter("status");
        if (!StringUtil.isEmpty(status)) {
            user.setStatus(status);
        }

        String userId = request.getParameter("userId");
        if (!StringUtil.isEmpty(userId)) {
            user.setUserId(Integer.parseInt(request.getParameter("userId")));
        }

        user.setMyid(request.getParameter("myid"));
        user.setName(request.getParameter("name"));
        user.setTel(request.getParameter("tel"));
        user.setEmail(request.getParameter("email"));
        user.setDescription(request.getParameter("description"));
        user.setAccount(request.getParameter("account"));
        user.setPassword(Md5Utils.hash(Constants.DEFAULT_PASSWORD));

        String organId = request.getParameter("organizeId");
        if (StringUtil.compare(Constants.REGEX_INTEGER, organId)) {
            user.setOrganizeId(Integer.parseInt(organId));
        }
        user.setOrganizeName(request.getParameter("organizeName"));

        Json json = getMessage(usersService.persistenceUser(user));
        return JSONArray.toJSONString(json);
    }


    @ResponseBody
    @RequestMapping(value = "/delUser", produces = "application/json;charset=utf-8")
    public String delOrgan(HttpServletRequest request) {
        String id = request.getParameter("userId");

        Json json = new Json();
        boolean flag = usersService.delete(Integer.parseInt(id)) > 0;

        if (flag) {
            json.setStatus(true);
            json.setMessage(Constants.POST_DATA_SUCCESS);
        } else {
            json.setMessage(Constants.POST_DATA_FAIL + Constants.IS_EXT_SUBMENU);
        }

        return JSONArray.toJSONString(json);
    }
}
