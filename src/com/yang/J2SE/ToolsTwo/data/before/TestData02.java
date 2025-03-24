package com.yang.J2SE.ToolsTwo.data.before;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestData02 {
    public static void main(String[] args) {
        Date d = new Date();
//        数据类型为Data
        System.out.println(d);
//        以String型输出，数据类型为String
        System.out.println(d.toString());
//        xxxx年x月xx日 xx:xx:xx
        System.out.println(d.toLocaleString());
//        日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
    }
}
