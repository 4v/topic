/**
 * Title: Organization.java
 * Package com.dyenigma.entity
 * author dingdongliang
 * date 2015年9月21日 上午11:07:55
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.entity;

import java.util.Date;

/**
 * ClassName: Organization
 * Description: 组织类
 * author dingdongliang
 * date 2015年9月21日 上午11:07:55
 *
 */

public class Organization extends BaseDomain {
    private Integer organization_id;
    private Integer company_id;
    private String myid;
    private Integer pid;
    private String full_name;
    private String ename;
    private Integer manager;
    private String iconCls;
    private Integer assistant_manager;
    private Integer emp_qty;
    private String status;
    private Date created;
    private Date lastmod;
    private String short_name;
    private String tel;
    private String fax;
    private String description;
    private Integer creater;
    private Integer modifyer;
    private String state = "closed";

    public Integer getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(Integer organization_id) {
        this.organization_id = organization_id;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getMyid() {
        return myid;
    }

    public void setMyid(String myid) {
        this.myid = myid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Integer getAssistant_manager() {
        return assistant_manager;
    }

    public void setAssistant_manager(Integer assistant_manager) {
        this.assistant_manager = assistant_manager;
    }

    public Integer getEmp_qty() {
        return emp_qty;
    }

    public void setEmp_qty(Integer emp_qty) {
        this.emp_qty = emp_qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastmod() {
        return lastmod;
    }

    public void setLastmod(Date lastmod) {
        this.lastmod = lastmod;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    public Integer getModifyer() {
        return modifyer;
    }

    public void setModifyer(Integer modifyer) {
        this.modifyer = modifyer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
