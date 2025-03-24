package com.yang.J2SE.ToolsTwo.data.after;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate02 {
    public static void main(String[] args) {
//        格式化对象
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();
        String date = ldt.format(formatter);
        System.out.println(date);
//        解析
        String str = "2002-03-21 08:00:01";
        DateTimeFormatter formatter2=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt2 = LocalDateTime.parse(str,formatter2);
        System.out.println(ldt2);
    }
}
