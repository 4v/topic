package com.dyenigma.test.entity;

import java.util.Date;

public class Role {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.ROLE_ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.ROLE_NAME
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.ROLE_DESC
     *
     * @mbggenerated
     */
    private String roleDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.SORT
     *
     * @mbggenerated
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.CREATED
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.LASTMOD
     *
     * @mbggenerated
     */
    private Date lastmod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.CREATER
     *
     * @mbggenerated
     */
    private Integer creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.MODIFYER
     *
     * @mbggenerated
     */
    private Integer modifyer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.ROLE_ID
     *
     * @return the value of sys_role.ROLE_ID
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.ROLE_ID
     *
     * @param roleId the value for sys_role.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.ROLE_NAME
     *
     * @return the value of sys_role.ROLE_NAME
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.ROLE_NAME
     *
     * @param roleName the value for sys_role.ROLE_NAME
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.ROLE_DESC
     *
     * @return the value of sys_role.ROLE_DESC
     *
     * @mbggenerated
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.ROLE_DESC
     *
     * @param roleDesc the value for sys_role.ROLE_DESC
     *
     * @mbggenerated
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.SORT
     *
     * @return the value of sys_role.SORT
     *
     * @mbggenerated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.SORT
     *
     * @param sort the value for sys_role.SORT
     *
     * @mbggenerated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.STATUS
     *
     * @return the value of sys_role.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.STATUS
     *
     * @param status the value for sys_role.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.CREATED
     *
     * @return the value of sys_role.CREATED
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.CREATED
     *
     * @param created the value for sys_role.CREATED
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.LASTMOD
     *
     * @return the value of sys_role.LASTMOD
     *
     * @mbggenerated
     */
    public Date getLastmod() {
        return lastmod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.LASTMOD
     *
     * @param lastmod the value for sys_role.LASTMOD
     *
     * @mbggenerated
     */
    public void setLastmod(Date lastmod) {
        this.lastmod = lastmod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.CREATER
     *
     * @return the value of sys_role.CREATER
     *
     * @mbggenerated
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.CREATER
     *
     * @param creater the value for sys_role.CREATER
     *
     * @mbggenerated
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.MODIFYER
     *
     * @return the value of sys_role.MODIFYER
     *
     * @mbggenerated
     */
    public Integer getModifyer() {
        return modifyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.MODIFYER
     *
     * @param modifyer the value for sys_role.MODIFYER
     *
     * @mbggenerated
     */
    public void setModifyer(Integer modifyer) {
        this.modifyer = modifyer;
    }
}