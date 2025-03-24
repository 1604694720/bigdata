package com.yang.J2SE.ToolsTwo.data.before;

import java.util.Date;

public class TestData01 {
    public static void main(String[] args) {
//        1970-1-1 8:00 到现在所经过的毫秒数。
//        常用来计算相隔时间，用于计算程序运行多少时间。
        long time = System.currentTimeMillis();
        System.out.println(time);
//        当前时间。
        Date d = new Date();
        System.out.println(d);
    }
}
