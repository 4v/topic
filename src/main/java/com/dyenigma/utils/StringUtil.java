package com.dyenigma.utils;

public class StringUtil {

    private StringUtil(){}

    public static boolean isEmpty(String s) {
        return s == null || s.equalsIgnoreCase("null") || s.trim().length() <= 0;
    }

}