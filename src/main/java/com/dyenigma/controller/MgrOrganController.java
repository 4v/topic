/**
 * Title: MgrOrganController.java
 * Package com.dyenigma.controller
 * author dingdongliang
 * date 2015年10月10日 上午11:09:11
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.controller;

import com.alibaba.fastjson.JSONArray;
import com.dyenigma.entity.Organization;
import com.dyenigma.model.Json;
import com.dyenigma.model.TreeModel;
import com.dyenigma.service.OrganizationService;
import com.dyenigma.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * author dingdongliang
 * ClassName: MgrOrganController
 * Description: 组织管理控制类（跳转和业务控制）
 * date 2015年10月10日 上午11:09:11
 */
@Controller
@RequestMapping(value = "/manage/organ")
public class MgrOrganController extends BaseController {
    private final Logger LOGGER = LoggerFactory.getLogger(MgrOrganController.class);

    @Autowired
    private OrganizationService organService;

    @RequestMapping("/organMain")
    public String main() {
        LOGGER.debug("main() is executed!");
        return "manage/organ/organMain";
    }

    /**
     * param    request
     * param return 参数
     * return List<Organization> 返回类型
     * throws
     * Title: findAllOrganList
     * Description: 按节点查询所有组织
     */
    @ResponseBody
    @RequestMapping(value = "/findAllOrganList", produces = "application/json;charset=utf-8")
    public List<Organization> findAllOrganList(HttpServletRequest request) {
        String pid = request.getParameter("id");
        return organService.findByPid(pid);
    }

    /**
     * param    request
     * param return 参数
     * return ModelAndView 返回类型
     * throws
     * Title: organEditDlg
     * Description: 跳转到编辑组织页面
     */
    @RequestMapping(value = "/organEditDlg", method = RequestMethod.GET)
    public ModelAndView organEditDlg() {

        LOGGER.debug("organEditDlg() is executed!");

        ModelAndView model = new ModelAndView();
        model.setViewName("manage/organ/organEditDlg");

        return model;
    }

    /**
     * param    request
     * param return 参数
     * return String 返回类型
     * throws
     * Title: delOrgan
     * Description: 删除组织处理
     */
    @ResponseBody
    @RequestMapping(value = "/delOrgan", produces = "application/json;charset=utf-8")
    public String delOrgan(HttpServletRequest request) {
        String id = request.getParameter("id");

        Json json = new Json();
        boolean flag = organService.deleteById(id);

        if (flag) {
            json.setStatus(true);
            json.setMessage(Constants.POST_DATA_SUCCESS);
        } else {
            json.setMessage(Constants.POST_DATA_FAIL + Constants.IS_EXT_SUBMENU);
        }

        return JSONArray.toJSONString(json);
    }

    /**
     * param return 参数
     * return List<TreeModel> 返回类型
     * throws
     * Title: findSuperOrgan
     * Description:显示所有可添加子项的组织项
     */
    @ResponseBody
    @RequestMapping(value = "/findSuperOrgan", produces = "application/json;charset=utf-8")
    public List<TreeModel> findSuperOrgan() {
        return organService.findSuperOrgan();
    }

    /**
     * param    request
     * param return 参数
     * return String 返回类型
     * throws
     * Title: saveOrUpdateOrgan
     * Description: 新增组织从或者更新组织处理
     */
    @ResponseBody
    @RequestMapping(value = "/saveOrUpdateOrgan", produces = "application/json;charset=utf-8")
    public String saveOrUpdateOrgan(Organization organ) {
        Json json = getMessage(organService.persistenceOrgan(organ));
        return JSONArray.toJSONString(json);
    }
}
