/**
 * Title: Log.java
 * Package com.dyenigma.entity
 * author dingdongliang
 * date 2015年9月14日 下午6:10:03
 * version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.entity;

import java.util.Date;

/**
 * ClassName: Log
 * Description: 日志类
 * author dingdongliang
 * date 2015年9月14日 下午6:10:03
 */

public class Log extends BaseDomain {

    private Integer logId;
    private Integer userId;
    private String name;
    private Date logDate;
    private Integer type;
    private String mac;
    private String ip;
    private Integer objectType;
    private String objectId;
    private String eventName;
    private String eventRecord;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
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

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventRecord() {
        return eventRecord;
    }

    public void setEventRecord(String eventRecord) {
        this.eventRecord = eventRecord;
    }
}
