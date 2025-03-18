package com.yang.J2SE.operation;

public class Test01 {
    public static void main(String[] args) {
//        位运算&、|、^、~、>>、>>> (了解)
//        以10和2为例子1010和0010。
        int a=10;
        int b=2;
        System.out.println(a&b);
//        1010
//        0010 00为0，01为0，11为1
//        0010 2
        System.out.println(a|b);
//        1010
//        0010 01为1 10为1 11为1 00为0
//        1010 10
        System.out.println(a^b);
//        1010
//        0010 00为0 01为1 11为0
//        1000 8
        System.out.println(a>>1);
//        1010 全体右移一位
//        0101 5
        int c=5;
        System.out.println(c>>1);
//        0101 全部右移一位
//        0010 2
        System.out.println(a>>>1);
//        1010 全部右移一位，自动补0
//        0101 5
        int d=-1;
        System.out.println(d>>>1);
//        负数会变成正数，且很大。
    }
}
