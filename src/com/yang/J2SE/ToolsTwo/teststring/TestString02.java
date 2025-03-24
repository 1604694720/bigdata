package com.yang.J2SE.ToolsTwo.teststring;

import java.time.Year;

public class TestString02 {
    public static void main(String[] args) {
        String sid = "430903200203210310";
//        取前不取后，取子串
        String yearstr = sid.substring(6,10);
        System.out.println(yearstr);

        Year year = Year.now();
//        取得年的数值-解析成的int=得到年龄
        int age = year.getValue()-Integer.parseInt(yearstr);
        System.out.println(age);

//        取子串
        String birthday = sid.substring(10,14);
        System.out.println(birthday);

//        取单个字符
        char gender = sid.charAt(6);
        System.out.println(gender);
    }
}
