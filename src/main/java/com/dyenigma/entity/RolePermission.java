/**
 * Title: RolePermission.java
 * Package com.dyenigma.entity
 * author dingdongliang
 * date 2015年9月14日 下午2:37:30
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.entity;

import java.util.Date;

/**
 * author dingdongliang
 * ClassName: RolePermission
 * Description: 权限许可
 * date 2015年9月14日 下午2:37:30
 */

public class RolePermission extends BaseDomain {

    private int rpId;
    private Role role;
    private Permission permission;
    private String status;
    private Date created;
    private Date lastmod;
    private int creater;
    private int modifyer;

    public int getRpId() {
        return rpId;
    }

    public void setRpId(int rpId) {
        this.rpId = rpId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
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

}
