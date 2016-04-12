package com.dyenigma.entity;

import java.util.Date;

/**
 * 用户角色
 */
public class UserRole extends BaseDomain {

    private Integer urId;
    private Users users;
    private Role role;
    private String status;
    private Date created;
    private Date lastmod;
    private Integer creater;
    private Integer modifyer;

    public Integer getUrId() {
        return urId;
    }

    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
}
