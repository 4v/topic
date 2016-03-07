/**
 * @Title: Log.java
 * @Package com.dyenigma.entity
 * @author dingdongliang
 * @date 2015年9月14日 下午6:10:03
 * @version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.entity;

import java.util.Date;

/**
 * @ClassName: Log
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author dingdongliang
 * @date 2015年9月14日 下午6:10:03
 *
 */

public class Log extends BaseDomain {

    private Integer log_id;
    private Integer user_id;
    private String name;
    private Date log_date;
    private Integer type;
    private String mac;
    private String ip;
    private Integer object_type;
    private String object_id;
    private String event_name;
    private String event_record;

    public Integer getLog_id() {
        return log_id;
    }

    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLog_date() {
        return log_date;
    }

    public void setLog_date(Date log_date) {
        this.log_date = log_date;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getObject_type() {
        return object_type;
    }

    public void setObject_type(Integer object_type) {
        this.object_type = object_type;
    }

    public String getObject_id() {
        return object_id;
    }

    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getEvent_record() {
        return event_record;
    }

    public void setEvent_record(String event_record) {
        this.event_record = event_record;
    }
}
