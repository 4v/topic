package com.dyenigma.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * topic 角色权限分配处理器 TODO
 * author Dyenigma
 * create 2016/4/2 18:57
 */
@Controller
@RequestMapping(value = "/manage/role")
public class MgrRoleController {
    private final Logger LOGGER = LoggerFactory.getLogger(MgrRoleController.class);

    @RequestMapping("/roleMgr")
    public String roleMain() {
        LOGGER.debug("roleMain() is executed!");
        return "manage/role/roleMain";
    }
}
