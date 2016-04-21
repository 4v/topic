package com.dyenigma.test.entity;

import java.util.Date;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.UR_ID
     *
     * @mbggenerated
     */
    private Integer urId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.USER_ID
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.CREATED
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.LASTMOD
     *
     * @mbggenerated
     */
    private Date lastmod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.CREATER
     *
     * @mbggenerated
     */
    private Integer creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_role.MODIFYER
     *
     * @mbggenerated
     */
    private Integer modifyer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.UR_ID
     *
     * @return the value of sys_user_role.UR_ID
     *
     * @mbggenerated
     */
    public Integer getUrId() {
        return urId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.UR_ID
     *
     * @param urId the value for sys_user_role.UR_ID
     *
     * @mbggenerated
     */
    public void setUrId(Integer urId) {
        this.urId = urId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.ROLE_ID
     *
     * @return the value of sys_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.ROLE_ID
     *
     * @param roleId the value for sys_user_role.ROLE_ID
     *
     * @mbggenerated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.USER_ID
     *
     * @return the value of sys_user_role.USER_ID
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.USER_ID
     *
     * @param userId the value for sys_user_role.USER_ID
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.STATUS
     *
     * @return the value of sys_user_role.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.STATUS
     *
     * @param status the value for sys_user_role.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.CREATED
     *
     * @return the value of sys_user_role.CREATED
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.CREATED
     *
     * @param created the value for sys_user_role.CREATED
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.LASTMOD
     *
     * @return the value of sys_user_role.LASTMOD
     *
     * @mbggenerated
     */
    public Date getLastmod() {
        return lastmod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.LASTMOD
     *
     * @param lastmod the value for sys_user_role.LASTMOD
     *
     * @mbggenerated
     */
    public void setLastmod(Date lastmod) {
        this.lastmod = lastmod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.CREATER
     *
     * @return the value of sys_user_role.CREATER
     *
     * @mbggenerated
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.CREATER
     *
     * @param creater the value for sys_user_role.CREATER
     *
     * @mbggenerated
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_role.MODIFYER
     *
     * @return the value of sys_user_role.MODIFYER
     *
     * @mbggenerated
     */
    public Integer getModifyer() {
        return modifyer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_role.MODIFYER
     *
     * @param modifyer the value for sys_user_role.MODIFYER
     *
     * @mbggenerated
     */
    public void setModifyer(Integer modifyer) {
        this.modifyer = modifyer;
    }
}