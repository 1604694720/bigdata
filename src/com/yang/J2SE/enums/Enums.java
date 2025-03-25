package com.yang.J2SE.enums;

public enum Enums {
    MONDAY(1,"周一"),
    TUESDAY(2,"周二"),
    WEDNESDAY(3,"周三"),
    THURSDAY(4,"周四"),
    FRIDAY(5,"周五");

    final int value;
    final String week;
    Enums(int value,String week){
        this.value = value;
        this.week = week;
    }
}
