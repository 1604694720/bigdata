package com.yang.J2SE.ToolsTwo.data.after;

import java.time.*;

public class TestData01 {
    public static void main(String[] args) {
//        日期
        LocalDate date = LocalDate.now();
        System.out.println(date);
//        时间
        LocalTime time = LocalTime.now();
        System.out.println(time);
//        年月日
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
//        年
        Year year = Year.now();
        System.out.println(year);
//        月份，取得枚举
        Month month = Month.JANUARY;
        System.out.println(month);
//        年月
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
    }
}
