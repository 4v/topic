package com.dyenigma.test.dao;

import com.dyenigma.test.entity.Company;

public interface CompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer coId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    int insert(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    int insertSelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    Company selectByPrimaryKey(Integer coId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Company record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_company
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Company record);
}