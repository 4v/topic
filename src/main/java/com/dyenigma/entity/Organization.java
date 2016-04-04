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
    private Integer organizationId;
    private Integer companyId;
    private String myId;
    private Integer pid;
    private String fullName;
    private String ename;
    private Integer manager;
    private String iconCls;
    private Integer assistantManager;
    private Integer empQty;
    private String status;
    private Date created;
    private Date lastmod;
    private String shortName;
    private String tel;
    private String fax;
    private String description;
    private Integer creater;
    private Integer modifyer;
    private String state = "closed";

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getMyId() {
        return myId;
    }

    public void setMyId(String myId) {
        this.myId = myId;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
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

    public Integer getAssistantManager() {
        return assistantManager;
    }

    public void setAssistantManager(Integer assistantManager) {
        this.assistantManager = assistantManager;
    }

    public Integer getEmpQty() {
        return empQty;
    }

    public void setEmpQty(Integer empQty) {
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
