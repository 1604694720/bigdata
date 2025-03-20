package com.yang.J2SE.method;

public class TestRecursion01 {
//    一头牛第十天吃玩草还剩1亩，牛每天吃当前的一半加一亩，第几天有多少亩。
    public static void main(String[] args) {
        System.out.println(test01(8));
    }
    public static int test01(int a) {
        return a==10?1:(test01(a+1)+1)*2;
    }
}
