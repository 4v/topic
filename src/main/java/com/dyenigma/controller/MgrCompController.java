package com.dyenigma.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping(value = "/manage/comp")
public class MgrCompController {

    private final Logger LOGGER = LoggerFactory.getLogger(MgrCompController.class);

    @RequestMapping("/compMain")
    public String compMain() {
        LOGGER.debug("compMain() is executed!");

        return "manage/company/companyMain";
    }

    //获取所有公司信息或按ID查询公司信息
    @ResponseBody
    @RequestMapping(value = "/findComp", produces = "application/json;charset=utf-8")
    public String findComp(HttpServletRequest request) {
        String pid = request.getParameter("id");
        return "";
    }

    //添加或者修改公司信息

    //删除公司信息
}