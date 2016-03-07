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
    private int organizationId;
    private int companyId;
    private String myId;
    private int pid;
    private String fullName;
    private String ename;
    private int manager;
    private String iconCls;
    private int assistantManager;
    private int empQty;
    private String status;
    private Date created;
    private Date lastmod;
    private String shortName;
    private String tel;
    private String fax;
    private String description;
    private int creater;
    private int modifyer;
    private String state = "closed";

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public int getAssistantManager() {
        return assistantManager;
    }

    public void setAssistantManager(int assistantManager) {
        this.assistantManager = assistantManager;
    }

    public int getEmpQty() {
        return empQty;
    }

    public void setEmpQty(int empQty) {
        this.empQty = empQty;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
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

    public int getCreater() {
        return creater;
    }

    public void setCreater(int creater) {
        this.creater = creater;
    }

    public int getModifyer() {
        return modifyer;
    }

    public void setModifyer(int modifyer) {
        this.modifyer = modifyer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
