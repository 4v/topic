package com.dyenigma.test.dao;

import com.dyenigma.test.entity.Division;

public interface DivisionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_division
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer divId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_division
     *
     * @mbggenerated
     */
    int insert(Division record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_division
     *
     * @mbggenerated
     */
    int insertSelective(Division record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_division
     *
     * @mbggenerated
     */
    Division selectByPrimaryKey(Integer divId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_division
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Division record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_division
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Division record);
}