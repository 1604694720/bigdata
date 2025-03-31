package com.yang.J2SE.oop.testfinal;

public class TestFinal {
    public static void main(String[] args) {
        final int a;
        a=100;//此处将a初始化
//        未初始化，未调用，不会报错，但一但调用便会报错。
        System.out.println(a);
    }
}

class TestFinal01{
//    final String string;
//    在类中，未初始化就会报错
}
