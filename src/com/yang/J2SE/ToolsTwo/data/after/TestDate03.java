package com.yang.J2SE.ToolsTwo.data.after;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TestDate03 {
    public static void main(String[] args) {
        LocalDate hk = LocalDate.of(1997,7,1);
        LocalDate om = LocalDate.of(1999,12,20);
//        间隔 年月日互相之间的差
        Period period = Period.between(hk,om);
        System.out.println(period.getYears()+" "+period.getMonths()+" "+period.getDays());

        LocalDate xh = LocalDate.of(2003,1,1);
        LocalDate today = LocalDate.now();
//        年龄的间隔
        long year = ChronoUnit.YEARS.between(xh,today);
        System.out.println(year);
//        两个时间总共差多少月份
        long month = ChronoUnit.MONTHS.between(xh,today);
        System.out.println(month);
//        活了多少天
        long days = ChronoUnit.DAYS.between(xh,today);
        System.out.println(days);

//        时间
        Instant instant = Instant.now();
        System.out.println(instant);
//        加30天
        Instant instant1 = instant.plus(Duration.ofDays(30));
        System.out.println(instant1);

//        间隔  取秒
        System.out.println(Duration.between(instant,instant1));
    }
}
