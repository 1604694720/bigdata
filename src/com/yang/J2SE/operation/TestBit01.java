package com.yang.J2SE.operation;

public class TestBit01 {
    public static void main(String[] args) {
        byte a=1;
        byte b=2;
//        byte c=a+b; 错误，a+b默认的类型为int。需要强转。
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
