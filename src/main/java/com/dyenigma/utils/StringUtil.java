package com.dyenigma.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    private StringUtil() {
    }

    public static boolean isEmpty(String s) {
        return s == null || s.equalsIgnoreCase("null") || s.trim().length() <= 0;
    }

    public static boolean compare(String regex, String str) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}