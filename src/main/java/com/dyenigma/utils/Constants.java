/**
 * @Title: Constants.java
 * @Package com.dyenigma.utils
 * @author dingdongliang
 * @date 2015年9月14日 下午6:07:30
 * @version V1.0
 * Copyright (c) 2015,dyenigma@163.com All Rights Reserved.
 */

package com.dyenigma.utils;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import com.dyenigma.shiro.ShiroUser;

/**
 * @ClassName: Constants
 * @Description:常用常量定义
 * @author dingdongliang
 * @date 2015年9月14日 下午6:07:30
 *
 */

public class Constants {

    private Constants() {
    }

    public static final String LOGIN_SESSION_DATANAME = "users";
    public static final String LOGIN_URL = "login";
    public static final String LOGIN_SUCCESS_URL = "index";
    public static final String LOGIN_LOGIN_OUT_URL = "loginout";
    public static final String LOGIN_MSG = "loginMsg";
    public static final String USERNAME_IS_NULL = "用户名为空!";
    public static final String LOGIN_IS_EXIST = "该用户已登录!";
    public static final String UNKNOWN_SESSION_EXCEPTION = "异常会话!";
    public static final String UNKNOWN_ACCOUNT_EXCEPTION = "账号错误!";
    public static final String INCORRECT_CREDENTIALS_EXCEPTION = "密码错误!";
    public static final String LOCKED_ACCOUNT_EXCEPTION = "账号已被锁定，请与系统管理员联系!";
    public static final String INCORRECT_CAPTCHA_EXCEPTION = "验证码错误!";
    public static final String AUTHENTICATION_EXCEPTION = "您没有授权!";
    public static final String UNKNOWN_EXCEPTION = "出现未知异常,请与系统管理员联系!";
    public static final String TREE_GRID_ADD_STATUS = "add";
    public static final String POST_DATA_SUCCESS = "数据更新成功!";
    public static final String POST_DATA_FAIL = "提交失败!";
    public static final String GET_SQL_LIKE = "%";
    public static final String IS_FUNCTION = "F";
    public static final String PERSISTENCE_STATUS = "A";
    public static final String PERSISTENCE_DELETE_STATUS = "I";
    public static final String SYSTEM_ADMINISTRATOR = "system";
    public static final String NULL_STRING = "";
    public static final String IS_DOT = ".";
    public static final String HQL_LIKE = "like";
    public static final String TEXT_TYPE_PLAIN = "text/plain";
    public static final String TEXT_TYPE_HTML = "text/html";
    public static final String FUNCTION_TYPE_O = "O";
    public static final String TREE_STATUS_OPEN = "open";
    public static final String TREE_STATUS_CLOSED = "closed";
    public static final String IS_EXT_SUBMENU = " 或可能包含菜单!";
    public static final String SHIRO_USER = "shiroUser";
    public static final String LOGS_INSERT = "insert:";
    public static final String LOGS_INSERT_TEXT = "插入:";
    public static final String LOGS_INSERT_NAME = "insertLogs";
    public static final String LOGS_UPDATE = "update:";
    public static final String LOGS_UPDATE_TEXT = "更新:";
    public static final String LOGS_UPDATE_NAME = "updateLogs";
    public static final String LOGS_DELETE = "delete:";
    public static final String LOGS_DELETE_TEXT = "删除:";
    public static final String LOGS_DELETE_NAME = "deleteLogs";
    public static final String LOGS_TB_NAME = "Log";
    public static final String FILE_SUFFIX_SQL = ".sql";
    public static final String FILE_SUFFIX_ZIP = ".zip";

    /**
     *
     * @Title: getCurrendUser
     * @Description: 获取当前登录用户实体类
     * @param @return 参数
     * @return ShiroUser 返回类型
     * @throws
     */
    public static ShiroUser getCurrendUser() {
        Subject subject = SecurityUtils.getSubject();
        return (ShiroUser) subject.getSession().getAttribute(SHIRO_USER);
    }

}
