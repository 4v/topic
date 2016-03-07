package com.dyenigma.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Role extends BaseDomain {

    private int roleId;
    private String name;
    private String description;
    private String status;
    private Date created;
    private Date lastmod;
    private int sort;
    private int creater;
    private int modifyer;
    private Set<UserRole> userRoles = new HashSet<>(0);
    private Set<RolePermission> rolePermissions = new HashSet<>(0);

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
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

    public Set<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(Set<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

    public Set<RolePermission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(Set<RolePermission> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

}
