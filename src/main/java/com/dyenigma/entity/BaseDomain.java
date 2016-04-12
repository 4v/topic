package com.dyenigma.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 实体类基类，重写toString()方法
 *
 * author dyenigma
 * create 2016/2/26 14:43
 */
public class BaseDomain {

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
