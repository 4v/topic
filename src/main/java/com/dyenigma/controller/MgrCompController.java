package com.dyenigma.controller;

import com.alibaba.fastjson.JSONArray;
import com.dyenigma.entity.Company;
import com.dyenigma.model.GridModel;
import com.dyenigma.model.Json;
import com.dyenigma.service.CompanyService;
import com.dyenigma.utils.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.web.subject.WebSubject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping(value = "/manage/comp")
public class MgrCompController extends BaseController {

    private final Logger LOGGER = LoggerFactory.getLogger(MgrCompController.class);

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/compMain")
    public String compMain() {
        LOGGER.debug("compMain() is executed!");

        return "manage/company/companyMain";
    }

    //分页查询公司信息
    @ResponseBody
    @RequestMapping(value = "/findComp", produces = "application/json;charset=utf-8")
    public GridModel findComp(HttpServletRequest request) {
        LOGGER.debug("findComp() is executed!");
        int pageNo = Integer.parseInt(request.getParameter("page"));
        int length = Integer.parseInt(request.getParameter("rows"));
        PageUtil pageUtil = new PageUtil((pageNo - 1) * length, length);
        GridModel gridModel = new GridModel();
        gridModel.setRows(companyService.findComp(pageUtil));
        gridModel.setTotal(companyService.getCount(null));
        return gridModel;
    }


    //弹出添加公司层
    @RequestMapping(value = "/companyEditDlg", method = RequestMethod.GET)
    public ModelAndView companyEditDlg() {

        LOGGER.debug("companyEditDlg() is executed!");

        ModelAndView model = new ModelAndView();
        model.setViewName("/manage/company/companyEditDlg");

        return model;
    }

    //添加或者修改公司信息,需要在控制器上也添加权限控制,怎么实现新添加菜单权限的控制？ TODO
    @RequiresPermissions({"compAdd", "compEdit"})
    @ResponseBody
    @RequestMapping(value = "/saveOrUpdateComp", produces = "application/json;charset=utf-8")
    public String saveOrUpdateComp(HttpServletRequest request) {
        Company company = new Company();
        String companyId = request.getParameter("companyId");
        if (!StringUtil.isEmpty(companyId)) {
            company.setCompanyId(Integer.parseInt(companyId));
        }
        String status = request.getParameter("status");
        if (!StringUtil.isEmpty(status)) {
            company.setStatus(status);
        }
        company.setName(request.getParameter("name"));

        company.setAddress(request.getParameter("address"));
        company.setBank(request.getParameter("bank"));
        company.setBankaccount(request.getParameter("bankaccount"));
        company.setContact(request.getParameter("contact"));
        company.setDescription(request.getParameter("description"));
        company.setEmail(request.getParameter("email"));
        company.setFax(request.getParameter("fax"));
        company.setManager(request.getParameter("manager"));
        company.setTel(request.getParameter("tel"));
        company.setZip(request.getParameter("zip"));

        Json json = getMessage(companyService.persistenceComp(company));
        return JSONArray.toJSONString(json);
    }

    //删除公司信息
    @RequiresPermissions({"compDel"})
    @ResponseBody
    @RequestMapping(value = "/delComp", produces = "application/json;charset=utf-8")
    public String delComp(HttpServletRequest request) {
        String id = request.getParameter("companyId");

        Json json = new Json();
        if (companyService.delComp(id)) {
            json.setStatus(true);
            json.setMessage(Constants.POST_DATA_SUCCESS);
        } else {
            json.setMessage(Constants.POST_DATA_FAIL + Constants.IS_EXT_SUBMENU);
        }
        return JSONArray.toJSONString(json);
    }

    //导出excel
    @RequestMapping(value = "/excelExport")
    public void excelExport(HttpServletResponse response) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String excelName = format.format(new Date());
        String path = "Company-" + excelName + ".xls";

        //这里不能获取绝对路径，导致不能继续进行， TODO
        ServletRequest request = ((WebSubject) SecurityUtils.getSubject()).getServletRequest();
        HttpSession httpSession = ((HttpServletRequest) request).getSession();


        String realPath = httpSession.getServletContext().getRealPath(File.separator);

        if (StringUtil.isEmpty(realPath)) {
            realPath = File.separator;
        }
        String allPath = realPath + "download" + File.separator + path;

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(allPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Company> list = new ArrayList<>();
        list.add(companyService.findById(Integer.parseInt(request.getParameter("companyId"))));
        ExcelUtil<Company> util = new ExcelUtil<>(Company.class);
        util.exportExcel(list, "Sheet", 60000, out);
        try {
            FileUtil.downFile(path, response, allPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}