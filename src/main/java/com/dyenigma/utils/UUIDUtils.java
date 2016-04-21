package com.dyenigma.utils;

import java.util.UUID;

/**
 * topic 生成数据库主键的方法
 * author: dyenigma
 * create: 2016/4/21 8:22
 */
public class UUIDUtils {
    /**
     * 获得一个UUID
     * <p>
     * return String UUID
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}
