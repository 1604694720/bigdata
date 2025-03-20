package com.yang.J2SE.method;

public class TestRecursion02 {
//    工厂第一个月生产500个，第二个月是第一个月的2倍少200个，第几个月生产多少个。
    public static void main(String[] args) {
        System.out.println(test(3));
    }
    public static int test(int a) {
        return a==1?500:test(a-1)*2-200;
    }
}
