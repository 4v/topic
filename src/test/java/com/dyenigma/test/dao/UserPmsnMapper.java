package com.dyenigma.test.dao;

import com.dyenigma.test.entity.UserPmsn;

public interface UserPmsnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_pmsn
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer upmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_pmsn
     *
     * @mbggenerated
     */
    int insert(UserPmsn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_pmsn
     *
     * @mbggenerated
     */
    int insertSelective(UserPmsn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_pmsn
     *
     * @mbggenerated
     */
    UserPmsn selectByPrimaryKey(Integer upmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_pmsn
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserPmsn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_pmsn
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserPmsn record);
}