package com.dyenigma.test.dao;

import com.dyenigma.test.entity.prjPmsn;

public interface prjPmsnMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_prj_pmsn
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer ppId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_prj_pmsn
     *
     * @mbggenerated
     */
    int insert(prjPmsn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_prj_pmsn
     *
     * @mbggenerated
     */
    int insertSelective(prjPmsn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_prj_pmsn
     *
     * @mbggenerated
     */
    prjPmsn selectByPrimaryKey(Integer ppId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_prj_pmsn
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(prjPmsn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_prj_pmsn
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(prjPmsn record);
}