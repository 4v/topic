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

    private int logId;
    private int userId;
    private String name;
    private Date logDate;
    private int type;
    private String mac;
    private String ip;
    private int objectType;
    private String objectId;
    private String eventName;
    private String eventRecord;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getObjectType() {
        return objectType;
    }

    public void setObjectType(int objectType) {
        this.objectType = objectType;
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
