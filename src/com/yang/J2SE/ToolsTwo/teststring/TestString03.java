package com.yang.J2SE.ToolsTwo.teststring;

public class TestString03 {
    public static void main(String[] args) {
//        创建了两个String "abc"
        String msg = new String("abc");
//        取得常量池中的地址
        msg = msg+"def";

//        常量池的
        String msg01 = "abc";
//        也是常量池的
        String msg02 = "abc";
        System.out.println(msg01==msg02);
        System.out.println(Integer.toHexString(msg02.hashCode()));
        System.out.println(Integer.toHexString(msg01.hashCode()));
//        所以地址相等，为true

//        创建了一个new String,其中abc以前就有了
        String msg03 = new String("abc");
        String msg04 = new String("abc");

    }
}
