package com.yang.J2SE;

public class Test01 {
    public static void main(String[] args) {
        int a = 1;
        int b=a+++a+++a+++a+a+a+++a;
//        a 2 3 4 4 4 5 5
//        b 1 2 3 4 4 4 5
        System.out.println(b);
//        b=1+2+3+4+4+4+5 23
    }
}
