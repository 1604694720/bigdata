package com.yang.J2SE.jcf.utils;

import java.io.ObjectInputFilter;

public class TestConfigUtils {
    public static void main(String[] args) {
        System.out.println(ConfigUtils.getValue("ip"));
        System.out.println(ConfigUtils.getValue("password"));
        System.out.println(ConfigUtils.getValue("username"));
    }
}
