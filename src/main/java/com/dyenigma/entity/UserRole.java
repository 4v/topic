package com.dyenigma.entity;

import java.util.Date;

public class UserRole extends BaseDomain {

    private int urId;
    private Users users;
    private Role role;
    private String status;
    private Date created;
    private Date lastmod;
    private int creater;
    private int modifyer;

    public int getUrId() {
        return urId;
    }

    public void setUrId(int urId) {
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
